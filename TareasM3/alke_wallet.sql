CREATE DATABASE IF NOT EXISTS Alke_wallet;
USE Alke_wallet;

-- Creación de la tabla usuarios
CREATE TABLE IF NOT EXISTS Usuarios(
	user_id int auto_increment primary key,
    nombre varchar(80),
    correo_electronico varchar(100),
    contrasena varchar(100),
    saldo decimal(10,2),
    fecha_creacion timestamp default current_timestamp);
    
-- Creación de la tabla transacciones
CREATE TABLE IF NOT exists Transacciones(
	transaccion_id int auto_increment primary key,
    sender_user_id int,
    receiver_user_id int,
    valor decimal(10,2),
    transaction_date timestamp default current_timestamp,
    foreign key (sender_user_id) references Usuarios(user_id),
    foreign key (receiver_user_id) references Usuarios(user_id));
    
-- Creación de la tabla moneda
CREATE TABLE IF NOT EXISTS Monedas(
	currency_id int auto_increment primary key,
    currency_name varchar(50),
    currenct_symbol varchar(5));
    
-- Insertar usuarios y transacciones de muestra
INSERT INTO Usuarios (nombre, correo_electronico, contrasena, saldo)
VALUES 
    ('Juan Perez Gonzalez', 'usuario@example.cl', sha2('123456',256), 1000000),
    ('María Peña Peña', 'usuario2@example.cl', sha2('1234567',256),250000),
    ('Jose Pedro Morales', 'usuario3@example.cl', sha2('1234568',256),500000);
    
SELECT * FROM Usuarios;

INSERT INTO Transacciones(sender_user_id, receiver_user_id, valor)
VALUES
	(1, 2 , 250000.20),
    (1, 3 , 50000),
    (2, 3, 15000),
    (3, 2, 5000);
    
SELECT * FROM transacciones;

INSERT INTO Monedas (currency_name, currenct_symbol)
VALUE
	('Dolar' , '$'),
    ('Euro' , '€' ),
    ('libra', '£');

Select * From monedas;

-- Utilizar el comando UPDATE para auemntar en un 15% el precio de las tansacciones ue tiene un precio menor a 50
SELECT * FROM Transacciones;
SET SQL_SAFE_UPDATES =0 ;

UPDATE Transacciones 
SET valor = valor * 1.15
WHERE valor < 20000;

SET SQL_SAFE_UPDATES =1;

SELECT * FROM transacciones;

-- Recuperar todas las transacciones de la tabla "Transacciones" junto con el nombre del usuario al cual pertenece
SELECT t.* , u.nombre As nombre_usuario
FROM Transacciones t 
join Usuarios u on t.sender_user_id = u.user_id or t.receiver_user_id = u.user_id;

-- Actualizar el nombre de un usuario en la tabla /Usuario 
UPDATE Usuarios
SET nombre = "NombreEditado"
where user_id = 1;

Select * FROM Usuarios; 

SELECT * FROM usuarios where user_id = 1;

-- consulta final 
SELECT t.* , u.nombre As nombre_usuario_actualizado
FROM Transacciones t 
join Usuarios u on t.sender_user_id = u.user_id or t.receiver_user_id = u.user_id;

-- Eliminar un usuaro y todas sus transacciones en froma de cascada
ALTER TABLE Transacciones
add constraint fk_sender_user_id
foreign key (sender_user_id)
references Usuarios(user_id)
On delete cascade;

ALTER TABLE Transacciones
add constraint fk_receiver_user_id
foreign key (receiver_user_id)
references Usuarios(user_id)
On delete cascade;

DELETE FROM Usuarios
where user_id = 1;
Select * From usuarios;

CREATE TABLE Cuentas (
	id Int primary key,
    saldo decimal(10,2));

INSERT INTO Cuentas (id, saldo)
values(1,1000),(2,2000);

select * from Cuentas;


DELIMITER //

CREATE PROCEDURE Realizar_transaccion()
BEGIN 
	DECLARE saldo_cuenta_1 DECIMAL(10,2);
	
    START TRANSACTION;
    
    -- Restar $200.00 del saldo de la cuenta con ID 1
    UPDATE Cuentas
    SET saldo = saldo - 200.00
    WHERE id = 1;
    
    -- Añadir $200.00 al saldo de la cuenta con ID 2
    UPDATE Cuentas
    SET saldo = saldo + 200.00
    WHERE id = 2;
    
    -- Vamos a suponer que esto fallará para cuando tenga un saldo insuficiente
    SELECT saldo INTO saldo_cuenta_1
    FROM Cuentas
    WHERE id = 1;
    
    IF saldo_cuenta_1 < 0 THEN 
		ROLLBACK;
        SELECT 'Transacción rechazada por no tener el mínimo suficiente';
	ELSE
		COMMIT;
        SELECT 'Transferencia realizada con éxito';
	END IF;
END //

DELIMITER ;

CALL Realizar_transaccion();
SELECT * FROM cuentas;

DELIMITER //
CREATE PROCEDURE Realizar_transaccionCorregido()
BEGIN
	DECLARE saldo_cuenta_1 DECIMAL(10,2);
    SELECT saldo INTO saldo_cuenta_1  FROM Cuentas WHERE id = 1;
	START TRANSACTION;
    IF saldo_cuenta_1 >= 200.00 THEN
		UPDATE Cuentas SET saldo = saldo - 200.00 WHERE id = 1;
		UPDATE Cuentas SET saldo = saldo + 200.00 WHERE id = 2;
        COMMIT;
        SELECT " Se ha realizado la transaccion correctamente" AS Mensaje;
     ELSE
 		SELECT "No tiene saldo sufiente" AS Mensaje;
		ROLLBACK;
     END IF;
END //
    
    
CREATE DATABASE IF NOT EXISTS Libreria;
USE libreria;

CREATE TABLE libro (
	id_libro int auto_increment primary key,
    titulo VARCHAR(80) not null,
    autor VARCHAR(80) not null,
    ano_publicacion date);
    

INSERT INTO libro (titulo, autor, ano_publicacion) 
VALUES	('Don Quijote de la Mancha', 'Miguel de Cervantes','1605-12-01'),
		('Cien años de soledad', 'Gabriel García Márquez','1967-12-01'),
        ('1984', 'George Orwell','1949-12-01'),
        ('Harry Potter y la piedra filosofal', 'J.K. Rowling ','1997-12-01'),
         ('Orgullo y prejuicio', 'Jane Austen ','1813-12-01');
Select * FROM libro;
         

CREATE TABLE copiaLibro (
	id_copia int auto_increment primary key,
    estado_libro VARCHAR(80) not null,
    ubicacion VARCHAR(80) not null,
    ano_publicacion date,
	id_libro int,
    FOREIGN KEY (id_libro) REFERENCES libro(id_libro));
    

/*
Seleccionar los campos “address” y “district” de la tabla “address” donde 
distrito sea Texas. 
*/
SELECT address, district
FROM address
WHERE district = 'Texas';

/*
 Seleccionar todas las columnas de la table “payment” cuyo campo “amount” 
sea mayor que 11.
*/
SELECT * 
FROM payment
WHERE amount>11;

/*
Visualizar todos los actores de la tabla “actor” cuyo first_name sea “Penelope”. 
Prueba con mayúscula y minúsculas para ver si devuelve el mismo resultado.
*/
SELECT *  FROM actor WHERE first_name = 'Penelope';
-- todo con minusculas
SELECT *  FROM actor WHERE first_name = 'penelope';
-- todo con mayusculas
SELECT *  FROM actor WHERE first_name = 'PENELOPE';

-- Reconoce mayuduculas y munusculas 
SELECT *  FROM actor WHERE BINARY first_name = 'Penelope';
SELECT *  FROM actor WHERE BINARY first_name = 'penelope';
SELECT *  FROM actor WHERE BINARY first_name = 'PENELOPE';

/*
 Visualizar las columnas first_name y last_name de la tabla “customer” de 
aquellos clientes que esté inactivos (campo “active” igual a 0) .
*/
SELECT first_name, last_name 
FROM customer
WHERE active = FALSE;

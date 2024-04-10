-- Comprueba la estructura de la tabla country.
DESCRIBE country;

-- Realiza una query para recuperar todas las columnas y filas de la de la tabla
SELECT * FROM country;

-- Visualiza los nombres de los países.
SELECT country.Name FROM country;

-- Visualizar el nombre el continente y la población de cada país.
SELECT Name, Continent, Population FROM country;

--  Cambia la cabecera de cada columna de la consulta anterior traduciéndola al español
SELECT Name AS 'Nombre', Continent AS 'Continente' , Population AS 'Población'  FROM country;

/*
español.
❖ Usando la columna “IndepYear” (Año de independencia), Averigua el número 
de años que un país lleva independiente suponiendo que estamos ahora 
mismo en el 2024. Debes visualizar el nombre del país el año de 
independencia y el número de años transcurridos.
*/

-- Visualiza el nombre del país el año de independencia el número de años transcurridos
SELECT Name AS 'Nombre', IndepYear AS 'Año de independencia', 2024 - IndepYear AS 'Años Transcurridos'
FROM country;

-- Visualiza los continentes sin que aparezcan repetidos
SELECT DISTINCT country.Continent AS 'Continenete' FROM country;

-- Visualizar los 5 primeros países
SELECT * FROM country LIMIT 5;

-- Visualizar los países desde la posición 10 a la 15
SELECT *
FROM country
LIMIT 5 OFFSET 9;

SELECT * FROM country;


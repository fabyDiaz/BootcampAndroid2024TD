-- Seleccionar el nombre del alumno número 10 y el curso que está haciendo 
SELECT alumnos.nombre, cursos.nombre 
FROM alumnos
INNER JOIN cursos ON alumnos.cod_curso = cursos.cod_curso
WHERE alumnos.cod_alumno = 10;

-- LIMIT 1 OFFSET 9
--  Visualizar las asignaturas del curso 1
SELECT *
FROM asignaturas
WHERE asignaturas.cod_curso=1;

--  Visualizar el número de asignaturas de cada curso. 
SELECT cursos.cod_curso, cursos.nombre, cursos.precio, COUNT(*) AS 'N° de asignaturas'
FROM cursos
INNER JOIN asignaturas ON asignaturas.cod_curso = cursos.cod_curso
GROUP BY cursos.cod_curso, cursos.nombre, cursos.precio;

--  Visualizar las asignaturas del profesor con el código 2
SELECT * FROM asignaturas 
WHERE asignaturas.cod_profesor = 2;

-- Visualizar las notas del alumno 10
SELECT nombre, nota
FROM alumnos
INNER JOIN notas_alumnos ON alumnos.cod_alumno = notas_alumnos.cod_alumno
WHERE alumnos.cod_alumno = 10;

-- Mostrar el curso y el promedio de notas de los alumnos
SELECT cursos.nombre AS 'curso', AVG(notas_alumnos.nota) AS 'notas'
FROM cursos
INNER JOIN notas_alumnos ON cursos.cod_curso = notas_alumnos.cod_curso
GROUP BY cursos.nombre;

-- Sacar el promedio, pero en este caso por asignatura.
SELECT asignaturas.nombre AS 'curso', AVG(notas_alumnos.nota) AS 'notas'
FROM asignaturas
INNER JOIN notas_alumnos ON asignaturas.cod_curso = notas_alumnos.cod_curso
GROUP BY asignaturas.nombre;

--  Inserta un par de filas en la tabla CURSOS. Esto permite tener dos cursos que no tienen curso
insert into cursos values(11,'curso11',100); 
insert into cursos values(12,'curso12',200);

-- Averiguar ahora el número de alumnos por curso. Debes usar la cláusula 
-- USING para hacer la join ( Investiga sobre la clausaula USING y aplícala).
SELECT cursos.nombre, count(alumnos.cod_curso) AS 'total alumnos'
FROM alumnos
JOIN cursos USING (cod_curso)
GROUP BY cursos.nombre;

--  Comprueba si aparecen los nuevos cursos. Hazlo con Left Join y deben aparecer 0 alumnos.
SELECT cursos.nombre, count(alumnos.cod_curso) AS 'total alumnos'
FROM cursos
JOIN alumnos USING (cod_curso)
GROUP BY cursos.nombre;

-- Comprueba si aparecen los nuevos cursos. Hazlo con Left Join y deben aparecer 0 alumnos
SELECT cursos.nombre, count(alumnos.cod_curso) AS 'total alumnos'
FROM cursos
LEFT JOIN alumnos USING (cod_curso)
GROUP BY cursos.nombre;

/*
Obtén cada asignatura con sus profesores. Hay algunos profesores que no 
aparecen ya que no tienen asignaturas todavía. Los debes incluir con un 
RIGHT JOIN 
*/
SELECT profesores.nombre AS 'Nombre Profesor', 
		profesores.apellidos AS 'Apellido Profesor',
        asignaturas.nombre AS 'Asignatura'
FROM asignaturas
RIGHT JOIN profesores USING (cod_profesor);











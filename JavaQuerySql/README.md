# Ejercicios java/MySql  

Cree una tabla llamada PERSONA, campos:
Nombres -- varchar2, apellidos -- varchar2, sexo –- Varchar2, fecha nacimiento -- Date, salario -- NUMBER(8,2)  
  - Inserte 10 registros diferentes.
1. Desde JAVA, muestre una lista de los nombres y apellidos de las personas concatenados, con la primera letra en mayúscula, además, muestre la longitud total de los apellidos.
2. Desde java, muestre los nombres de las personas en mayúscula cuya fecha de nacimiento sea mayor a 01/01/2010
3. Desde java, muestre el salario promedio (AVG) de las personas agrupadas por sexo.
4. Del grupo anterior excluya los grupos cuyo promedio es menor a 1000

## Desarrollo:

Para cumplir con los requerimientos se crearon 5 clases las primeras 4 implementan la interfaceI IQuerySql que tiene el metodo getQuery() el cual reescribimos para realizar en cada clase para realizar las diferentes consultas:  
- QueryForName()
- QueryForDate()
- QueryAvgSalary()
- QueryAvgGroup()

La quinta clase es ConnectSqlDb que tiene el metodo connectDatabase para realizar la conexion con la base de datos, las anteriores clases usadas para realizar las consultas instancian  a esta clase para su respectivas conexiones.  

## Base de datos:  
Se creo la base de datos en MySQL Workbench.

## Consulta todas las tablas base de datos:
 
 ![tabla](https://i.ibb.co/RPscmQd/db.png)

## Ejecucion del test:

![Query D1B](https://i.ibb.co/mbdqqj6/query.png)
## Author
* **Nasser Abuchaibe** - [NasserAbuchaibe](https://github.com/NasserAbuchaibe)
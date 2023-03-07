# 2DAM: Acceso a Datos: Simulacro 2ªEv

## Enunciado

### Ejercicio 1: Hibernate
Crear la bbdd y clases pertinentes para generar un programa con Hibernate con la siguiente estructura:
1. Director:
   - nombre
   - apellidos
   - origen
2. Película
    - título
    - año
    - descripción

Cada director puede tener asociada una o más películas.
Crear al menos 2 directores con 2 películas cada uno.


### Ejercicio 2: MongoDB

Conéctate a tu cuenta de ATLAS  y realizar las siguientes queries utilizando la BBDD sample_training

1. Buscar un documento en la colección posts con _id 50ab0f8bbcf1bfe2536dc559
2. Buscar  los documentos en la colección trips  cuyo año de nacimiento (birth year) sea mayor de 1960 y menor o igual de 1961 y el la duración del viaje (tripduration) sea igual a 853
3. Buscar los documentos en la colección trips cuyo tipo de usuario (userType) sea igual a “Subscriber”. Mostrar solo los campos tripDuration y userType del resultado. Además la query debe ordenar los documentos encontrados por tripDuration de menor a mayor
4. Buscar los documentos en la colección companies que el campo name de products sea igual a “Thoof” . Utilizar el operador $elemMatch
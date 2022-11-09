EJERCICIO 2:
Implementar una versión muy simplificada de un sistema para una biblioteca. En el sistema aparecen socios, que se registran en la biblioteca y a partir de ese momento pueden tomar prestados libros de la misma. 
Un socio está caracterizado por un número de socio, un nombre y una dirección; además, en cada momento se puede saber el número de libros que un socio tiene prestados. Por su parte, de cada libro se conoce su código, título, autor y si está o no disponible; además se puede saber en cualquier momento la localización del libro en la biblioteca (si está disponible o si lo tiene algún socio). 
Los libros se prestan a los socios, y como consecuencia aparece la noción de préstamo; un préstamo estará caracterizado, además de por el código del libro prestado y el número de socio, por la fecha del mismo. Por otra parte el sistema también permite llevar control de los socios que tengan prestados más de 3 libros (usar filter para esta acción).
Demuestre el funcionamiento de su código a partir de escenarios puntuales con valores ficticios pero que permitan ejecutar las acciones principales de las clases. Agregue datos, cree socios, haga que reserven libros, muestre estados de libros, muestre socios que tengan prestados más de 3 libros, etc.


CONSOLA:
El prestamo se ha realizado correctamente
El prestamo se ha realizado correctamente
---------INFORMACION GENERAL DE LA BIBLIOTECA---------
Biblioteca{nombre='Biblioteca TEC San Carlos', libros=[Libro{codigo = 10001, titulo = 'El diario de Ana Frank', autor = 'Ana Frank', disponibilidad = false}, Libro{codigo = 10002, titulo = 'Ciencias naturales', autor = 'Mi amigo el biólogo', disponibilidad = false}, Libro{codigo = 10003, titulo = 'Cálculo y álgebra lineal', autor = 'Definitivamente yo no', disponibilidad = true}, Libro{codigo = 10004, titulo = 'Salud Mental', autor = '¿Que es eso?', disponibilidad = true}], socios=[Socio{idSocio = 101, nombre = 'Julieth Campos', direccion = 'Valle Azul San Ramón', numLibrosPrestados = 5}, Socio{idSocio = 102, nombre = 'Yerlin Perez', direccion = 'Valle Azul San Ramón', numLibrosPrestados = 2}, Socio{idSocio = 103, nombre = 'Carlos Marin', direccion = 'Rio Cuarto', numLibrosPrestados = 8}, Socio{idSocio = 104, nombre = 'Juana Vargas', direccion = 'Upala', numLibrosPrestados = 5}], prestamos=[Préstamo{idPrestamo = 1, codigoLibro = 10001, idSocio = 101}, Préstamo{idPrestamo = 2, codigoLibro = 10002, idSocio = 102}]}
---------Socios con el maximo de libros prestados---------
[Socio{idSocio = 101, nombre = 'Julieth Campos', direccion = 'Valle Azul San Ramón', numLibrosPrestados = 5}, Socio{idSocio = 103, nombre = 'Carlos Marin', direccion = 'Rio Cu

EJERCICIO 1:
Realizar la implementación de un programa que emule un editor gráfico de documentos que admita el agrupamiento, lo cual es un concepto que 
se utiliza en toda una gama de editores gráficos. Suponer que el documento consta de varias hojas. Cada hoja contiene objetos representables, 
incluyendo textos, objetos geométricos y grupos. Un grupo es, simplemente, un conjunto de objetos representables, y que posiblemente hasta 
incluya a otros grupos. Los objetos geométricos pueden ser círculos, elipses, rectángulos, líneas y cuadrados.
Cree instancias para demostrar el uso exhaustivo de cada uno de los elementos del editor gráfico de documentos. Utilice ocultamiento de 
información y declare solo los get/set necesarios para su implementación


CONSOLA:
-----------Círculo-----------
Radio del círculo: 6
Area del circulo: 113
-----------Cuadrado-----------
Lado del cuadrado: 10
Area del cuadrado: 100
-----------Texto-----------
Texto escrito: Hola mundo soy Julieth
-------------------Grupo-------------------
Este grupo de objetos representables tiene:
[Circulo{radio = 6, area = 113}, Cuadrado{lado = 10, area = 100}]
-------------------Hoja-------------------
Hoja{dimensiones='21cm x 29cm', objetos=[Grupo{objetos=[Circulo{radio = 6, area = 113}, Cuadrado{lado = 10, area = 100}]}]}
-------------------Documento-------------------
Documento{nombre='Documento de prueba', hojas=[Hoja{dimensiones='21cm x 29cm', objetos=[Grupo{objetos=[Circulo{radio = 6, area = 113},
Cuadrado{lado = 10, area = 100}]}]}]}

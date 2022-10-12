/*
Fecha: 8/8/2020
Hecho por: Julieth Campos
Ejercicio 1:
Haga un programa que cuente e indique el número de caracteres, el número de palabras y el número de
líneas de un texto cualquiera (obtenido de cualquier forma que considere). Considere hacer el cálculo
de las tres variables en el mismo proceso.
*/

package main

import (
	"fmt"
	"strings"
)

func contadorTexto(text string) {

	//contar los caracteres
	tex := strings.Fields(text)                       //divide la cadena de texto en palabras "hola","me", crea un slice de substrings of str
	union := strings.Join(tex, "")                    //une los subStrings
	fmt.Println("Numero de caracteres: ", len(union)) //cuenta los caracteres del string completo

	//contar las palabras
	fmt.Println("Numero de palabras: ", len(tex)) //cuenta los datos del slice, en este caso cuenta cada substring(palabra)

	//contar las líneas
	n := strings.Split(text, "\n")
	fmt.Println("Cantidad de lineas: ", len(n))

}

// split
func main() {

	texto :=
		`La Tecnología se define como el conjunto de conocimientos y técnicas que,
		aplicados de forma lógica y ordenada, permiten al ser humano modificar su entorno 
		material o virtual para satisfacer sus necesidades, esto es, un proceso combinado de 
		pensamiento y acción con la finalidad de crear soluciones útiles.`

	texto2 := "La Tecnología se define como el conjunto de conocimientos y técnicas que,\n" +
		"aplicados de forma lógica y ordenada, permiten al ser humano modificar su entorno\n" +
		"material o virtual para satisfacer sus necesidades, esto es, un proceso combinado de\n" +
		"pensamiento y acción con la finalidad de crear soluciones útiles.\n"
	contadorTexto(texto)
	fmt.Println("\n--------------------------------------------------\n", texto2, "--------------------------------------------------")
}




/**
Consola:
Numero de caracteres:  264
Numero de palabras:  48
Cantidad de lineas:  4
*/

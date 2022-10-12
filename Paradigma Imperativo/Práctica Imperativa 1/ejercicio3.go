/*
*
Fecha: 16/8/2020
Hecho por: Julieth Campos
Ejercicio 3:
Escriba una función que permita rotar una secuencia de elementos N posiciones a la izquierda o a la derecha según sea el
caso en función al parámetro que se reciba. Los parámetros deben ser un puntero a un arreglo previamente creado,
la cantidad de movimiento de rotación y la dirección (0 = izq y 1 = der).

A partir de esta función, escriba un programa que haga varias rotaciones cualesquiera de una secuencia de elementos
previamente creada que sea inmutable. Al final debe imprimirse el resultado de cada rotación además de la secuencia original.

	Un ejemplo de rotación puede ser el siguiente:

Secuencia Original = [a, b, c, d, e, f, g, h,]
Cantidad de rotaciones = 3
Dirección = izq
Secuencia final rotada = [d, e, f, g, h, a, b, c]   Nótese que cada iteración, el elemento más a la izquierda pasó
a formar parte del final de la secuencia, si la rotación fuera a la derecha, sería lo contrario
*/
package main

import "fmt"

func rotar1der(lista *[]string) {
	last := (*lista)[len(*lista)-1]
	var i int
	for i = len(*lista) - 2; i >= 0; i-- {
		(*lista)[i+1] = (*lista)[i]
	}
	(*lista)[0] = last
}

func rotar1izq(lista *[]string) {
	first := (*lista)[0]
	var i int
	for i = 0; i < len(*lista)-1; i++ {
		(*lista)[i] = (*lista)[i+1]
	}
	(*lista)[len(*lista)-1] = first
}

func rotar(lista *[]string, rot int, dir int) {
	if rot < 0 && rot >= len(*lista) {
		return
	}
	var i int
	for i = 0; i < rot; i++ {
		if dir == 0 {
			rotar1izq(lista)
		} else if dir == 1 {
			rotar1der(lista)
		} else {
			println("No existe la dirección especificada, los valores permitidos son 0 = izquierda y 1 = derecha")
		}
	}
}

func main() {
	array := []string{"a", "b", "c", "d", "e", "f", "g", "h"}
	k := 3
	array2 := []string{"a", "b", "c", "d", "e", "f", "g", "h"}
	fmt.Println("Lista original: ", array)
	rotar(&array, k, 0)
	fmt.Println("Lista rotada", k, "veces a la izquierda: ", array)
	rotar(&array2, k, 1)
	fmt.Println("Lista rotada", k, "veces a la derecha: ", array2)
}

/**
------------------CONSOLA------------------------
Lista orginal:  [a b c d e f g h]
Lista rotada 3 veces a la izquierda:  [d e f g h a b c]
Lista rotada 3 veces a la derecha:  [f g h a b c d e]

*/

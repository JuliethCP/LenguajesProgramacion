/*
Fecha: 8/8/2020
Hecho por: Julieth Campos
Ejercicio 4:
Escriba un programa que utilice una estructura y un arreglo/slice para almacenar en memoria
un inventario de una tienda que vende zapatos. Cada zapato debe contar con la información de
su modelo (marca), su precio y la talla del mismo que debe ir únicamente del 34 al 44.
La estructura debe llamarse "calzado". El programa debe poder almacenar la información “quemada”
para 10+ zapatos del inventario y un stock de N cantidad de unidades de dicho zapato (quiere decir
por ejemplo que puede existir en inventario el zapato marca Nike, talla 42 y que cuesta 50000 colones,
pero además que puede existir no solo un par de esos, si no N pares del mismo zapato).

Haga una función que venda zapatos (eliminando del stock cada vez que haya venta e indicando que no
se puede vender porque ya o hay stock) y pruébela dentro del main haciendo las ventas que usted
considere para demostrar su funcionamiento.
*/
package main

import (
	"fmt"
)

type calzado struct {
	marca  string
	precio int
	talla  byte
	id     byte
}

var listaZapatos []calzado

func crearZapato(m string, p int, t byte, i byte) calzado {
	if t >= 34 && t <= 44 {
		z := calzado{marca: m, precio: p, talla: t, id: i}
		fmt.Println("Zapato creado con exito!!")
		return z
	} else {
		fmt.Println("El numero de talla no es permitido")
		y := calzado{}
		return y
	}

}

func (shoe *calzado) agregarZapato(z calzado) {
	if shoe.marca == "" && shoe.precio == 0 && shoe.talla == 0 && shoe.id == 0 {
		return

	} else {
		listaZapatos = append(listaZapatos, z)
	}

}

// val inventario = listOf<Pair<Int,Int>>(
func main() {

	z := crearZapato("Nike", 35000, 32, 1)
	z.agregarZapato(z)
	a := crearZapato("Adidas", 45000, 35, 1)
	a.agregarZapato(a)
	fmt.Println(listaZapatos)
}

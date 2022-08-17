/*
Fecha: 15/8/2020
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
	stock  byte
}

type listaZapatos []calzado

var lZapatos listaZapatos

func (l *listaZapatos) buscarZapato(marca string, talla byte) int { //el retorno es el índice del producto encontrado y -1 si no existe
	var result = -1
	var i int
	for i = 0; i < len(*l); i++ {
		if (*l)[i].marca == marca && (*l)[i].talla == talla {
			result = i
		}
	}
	return result
}

func (l *listaZapatos) crearZapato(marca string, precio int, talla byte, stock byte) {
	z := (*l).buscarZapato(marca, talla)
	if z == -1 {
		if talla >= 34 && talla <= 44 {
			*l = append(*l, calzado{marca: marca, precio: precio, talla: talla, stock: stock})
			println("El zapato ha sido creado exitosamente")
		} else {
			println("La talla especificada no coincide con las permitidas, favor intente de nuevo...")
		}
	} else {
		if (*l)[z].marca == marca && (*l)[z].talla == talla {
			s := (*l)[z].stock + stock
			(*l)[z].stock = s
		}
	}
}
func remove(slice listaZapatos, s int) listaZapatos {
	return append(slice[:s], slice[s+1:]...)
}

func (l *listaZapatos) venderZapato(marca string, talla byte, cant byte) {
	var shoe = l.buscarZapato(marca, talla)
	if shoe == -1 {
		println("El zapato no existe, entonces no se puede vender")

	} else if (*l)[shoe].stock >= cant {
		(*l)[shoe].stock = (*l)[shoe].stock - cant
		println("Zapato vendido con éxito")

	} else if (*l)[shoe].stock == 0 {
		println("No hay zapatos disponibles en el inventario")
		remove(*l, shoe)

	} else {
		println("La venta no puede ser ejecutada ya que no hay suficientes zapatos en el inventario para vender los solicitados")
	}
}
func main() {
	lZapatos.crearZapato("Nike", 25000, 35, 10)
	lZapatos.crearZapato("Adidas", 35000, 37, 10)
	lZapatos.crearZapato("DC", 35000, 40, 15)
	lZapatos.crearZapato("DC", 40000, 35, 8)
	lZapatos.crearZapato("Puma", 45000, 42, 10)
	lZapatos.crearZapato("Puma", 25000, 36, 12)
	lZapatos.crearZapato("Crocs", 15000, 38, 20)
	lZapatos.crearZapato("Converse", 40000, 37, 10)
	fmt.Println(lZapatos)
	println("---------------AUMENTO DE STOCK------------------")
	lZapatos.crearZapato("Nike", 25000, 35, 2)
	lZapatos.crearZapato("DC", 45000, 40, 4)
	lZapatos.crearZapato("Crocs", 45000, 38, 4)

	fmt.Println(lZapatos)
	println("-------------------VENTAS--------------------")
	lZapatos.venderZapato("Nike", 35, 3)
	lZapatos.venderZapato("Adidas", 37, 5)
	lZapatos.venderZapato("DC", 40, 1)
	lZapatos.venderZapato("Puma", 42, 3)
	lZapatos.venderZapato("Puma", 36, 1)
	lZapatos.venderZapato("Crocs", 38, 10)
	fmt.Println(lZapatos)
}

/** --------------------------------------------------CONSOLA--------------------------------------------------
El zapato ha sido creado exitosamente
El zapato ha sido creado exitosamente
El zapato ha sido creado exitosamente
El zapato ha sido creado exitosamente
El zapato ha sido creado exitosamente
El zapato ha sido creado exitosamente
El zapato ha sido creado exitosamente
El zapato ha sido creado exitosamente
[{Nike 25000 35 10} {Adidas 35000 37 10} {DC 35000 40 15} {DC 40000 35 8} {Puma 45000 42 10} {Puma 25000 36 12} {Crocs 15000 38 20} {Converse 40000 37 10}]
---------------AUMENTO DE STOCK------------------
[{Nike 25000 35 12} {Adidas 35000 37 10} {DC 35000 40 19} {DC 40000 35 8} {Puma 45000 42 10} {Puma 25000 36 12} {Crocs 15000 38 24} {Converse 40000 37 10}]
-------------------VENTAS--------------------
Zapato vendido con éxito
Zapato vendido con éxito
Zapato vendido con éxito
Zapato vendido con éxito
Zapato vendido con éxito
Zapato vendido con éxito
[{Nike 25000 35 9} {Adidas 35000 37 5} {DC 35000 40 18} {DC 40000 35 8} {Puma 45000 42 7} {Puma 25000 36 11} {Crocs 15000 38 14} {Converse 40000 37 10}]

Process finished with the exit code 0

*/


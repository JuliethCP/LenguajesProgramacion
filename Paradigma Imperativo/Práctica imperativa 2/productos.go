package main

import (
	"fmt"
	"sort"
)

type producto struct {
	nombre   string
	cantidad int
	precio   int
}
type listaProductos []producto

var lProductos listaProductos
var listaProductosMinimos listaProductos

const existenciaMinima int = 10 //La existencia mínima es el número mínimo debajo del cual se deben tomar eventuales decisiones

func (l *listaProductos) buscarProducto(nombre string) int { //el retorno es el índice del producto encontrado y -1 si no existe
	var result = -1
	var i int
	for i = 0; i < len(*l); i++ {
		if (*l)[i].nombre == nombre {
			result = i
		}
	}
	return result
}

// modificar el código para que cuando se agregue un producto, si este ya se encuentra, incrementar la cantidad
// de elementos del producto y eventualmente el precio si es que es diferente
func (l *listaProductos) agregarProducto(nombre string, cantidad int, precio int) {
	g := (*l).buscarProducto(nombre)
	if g == -1 {
		*l = append(*l, producto{nombre: nombre, cantidad: cantidad, precio: precio})
	} else {
		if (*l)[g].nombre == nombre {
			i := (*l)[g].cantidad + cantidad
			(*l)[g].cantidad = i
			if (*l)[g].precio != precio {
				(*l)[g].precio = precio
			} else {
				k := (*l)[g].precio
				(*l)[g].precio = k
			}
		}
	}
}

func remove(slice listaProductos, s int) listaProductos {
	return append(slice[:s], slice[s+1:]...)
}

func (l *listaProductos) venderProducto(nombre string, cant int) {
	var prod = l.buscarProducto(nombre)
	if prod == -1 {
		println("El zapato no existe, entonces no se puede vender")
	} else if (*l)[prod].cantidad >= cant {
		(*l)[prod].cantidad = (*l)[prod].cantidad - cant
		println("Producto vendido con éxito")
	} else if (*l)[prod].cantidad == 0 {
		println("No hay productos disponibles en el inventario")
		remove(*l, prod)
	} else {
		println("La venta no puede ser ejecutada ya que no hay suficientes productos en el inventario para vender los solicitados")
	}
}

func (l *listaProductos) listarProductosMínimos() listaProductos {

	for i := 0; i < len(*l); i++ {
		if (*l)[i].cantidad <= existenciaMinima {
			listaProductosMinimos = append(listaProductosMinimos, (*l)[i])
		}
	}
	fmt.Println("Lista de productos con cantidad por debajo del mínimo:\n ", listaProductosMinimos)
	return listaProductosMinimos
}

/**----------------------------------------TAREA----------------------------------------------------------
1)Amplie el funcionamiento del ejercicio de Productos visto en clase para que el programa ahora permita:
a.	A partir de la lista de productos con mínimas existencias de inventario, ampliar dicho inventario con
la compra de más unidades de dicho producto hasta que cumplan con el mínimo establecido de manera constante.
Se sugiere crear una función denominada “aumentarInventarioDeMinimos(listaMinimos)”
*/

func aumentarInventarioDeMinimos(listaProductosMinimos listaProductos) {

	for i := range listaProductosMinimos {
		listaProductosMinimos[i].cantidad = existenciaMinima
	}
	fmt.Println("Lista de inventarios minimos actualizada:\n ", listaProductosMinimos)
}

/*
*
b.	Crear una función que ordene la lista de productos usando como llave para el ordenamiento cualquiera
de los elementos de la estructura producto. La lista/slice debe quedar modificada al finalizar el método.
Se solicita investigar y hacer uso de alguna función predefinida de alguna librería del lenguaje Go.
*/
func ordenarLista(l *listaProductos) {

	sort.Slice((*l), func(i, j int) bool {
		return (*l)[i].precio < (*l)[j].precio
	})
	fmt.Println("Lista ordenada por el precio del producto: \n", *l)
}

func llenarDatos() {
	lProductos.agregarProducto("arroz", 15, 2500)
	lProductos.agregarProducto("frijoles", 4, 2000)
	lProductos.agregarProducto("leche", 8, 1200)
	lProductos.agregarProducto("café", 12, 4500)

}

func main() {
	llenarDatos()
	fmt.Println("Lista total de productos: \n", lProductos)
	lProductos.agregarProducto("café", 12, 5500)
	fmt.Println("Cantidad actualizada de café:", lProductos)
	lProductos.venderProducto("café", 4)
	fmt.Println(lProductos)
	lProductos.venderProducto("café", 20)
	fmt.Println(lProductos)
	lProductos.venderProducto("arroz", 4)
	fmt.Println(lProductos)
	lProductos.venderProducto("café", 20)
	fmt.Println(lProductos)
	lProductos.venderProducto("frijoles", 4)
	fmt.Println(lProductos)
	lProductos.venderProducto("leche", 10)
	fmt.Println("---------------------------------------------------------------")
	ordenarLista(&lProductos)
	fmt.Println("---------------------------------------------------------------")
	lProductos.listarProductosMínimos()
	aumentarInventarioDeMinimos(listaProductosMinimos)
	ordenarLista(&listaProductosMinimos)

}

/**
CONSOLA:
Lista total de productos:
 [{arroz 15 2500} {frijoles 4 2000} {leche 8 1200} {café 12 4500}]
Cantidad actualizada de café: [{arroz 15 2500} {frijoles 4 2000} {leche 8 1200} {café 24 5500}]
Producto vendido con éxito
[{arroz 15 2500} {frijoles 4 2000} {leche 8 1200} {café 20 5500}]
Producto vendido con éxito
[{arroz 15 2500} {frijoles 4 2000} {leche 8 1200} {café 0 5500}]
Producto vendido con éxito
[{arroz 11 2500} {frijoles 4 2000} {leche 8 1200} {café 0 5500}]
No hay productos disponibles en el inventario
[{arroz 11 2500} {frijoles 4 2000} {leche 8 1200} {café 0 5500}]
Producto vendido con éxito
[{arroz 11 2500} {frijoles 0 2000} {leche 8 1200} {café 0 5500}]
La venta no puede ser ejecutada ya que no hay suficientes productos en el inventario para vender los solicitados
---------------------------------------------------------------
Lista ordenada por el precio del producto:
 [{leche 8 1200} {frijoles 0 2000} {arroz 11 2500} {café 0 5500}]
---------------------------------------------------------------
Lista de productos con cantidad por debajo del mínimo:
  [{leche 8 1200} {frijoles 0 2000} {café 0 5500}]
Lista de inventarios minimos actualizada:
  [{leche 10 1200} {frijoles 10 2000} {café 10 5500}]
Lista ordenada por el precio del producto:
 [{leche 10 1200} {frijoles 10 2000} {café 10 5500}]

Process finished with the exit code 0


*/

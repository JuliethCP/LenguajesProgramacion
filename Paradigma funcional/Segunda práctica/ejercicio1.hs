{- EJERCICIO 1:
1)	Migrar el ejercicio realizado en Go sobre facturas con listas de productos haciendo énfasis 
en la implementación de las funciones para calcular el monto a pagar por la factura completa y 
el monto a pagar por concepto del 13% de impuesto de venta para aquellos productos que deban 
pagarlo según criterio de selección. -}

import Text.Printf

data Producto = Producto { nombre :: String
                    , descripcion :: String
                    , montoVenta :: Int
                     } deriving Show
                     
reducirLista :: (Foldable t, Num a) => t a -> a
reducirLista listaProductos =
    sum listaProductos 

calcularMontoImpuesto :: Num b => b -> [Producto] -> [b]
calcularMontoImpuesto impuesto listaProductos =
    map articulos listaProductos 
    where
        articulos prod= (impuesto* fromIntegral (montoVenta prod))

revisarMontosImpuesto rangoPagoImpuestos listaProductos =
    filter articulos listaProductos 
    where
        articulos prod = ((montoVenta prod) >= rangoPagoImpuestos)

calcularMontoVenta listaProductos =
    map articulos listaProductos 
    where
        articulos prod= ((montoVenta prod))

main :: IO ()
main = do
    let porcentajeImpuesto= 0.13
    let rangoPagoImpuestos=20000
    
    let listaProductos=[
            (Producto "Tarjeta madre" "MSI" 54200),
            (Producto "Mouse" "Logitech" 15000),
            (Producto "Memoria ssd" "502 gb" 65000),
            (Producto "Teclado" "Razer" 30000),
            (Producto "Cable HDMI" "1mm" 5000),
            (Producto "Camara" "Logitech" 25000),
            (Producto "Pantalla" "Samsumg" 18000)]
    
    let buscarImpuestos= calcularMontoImpuesto porcentajeImpuesto (revisarMontosImpuesto rangoPagoImpuestos listaProductos)
    let reduce= reducirLista buscarImpuestos

    let buscarPreciosProducto= calcularMontoVenta listaProductos
    let reduce1 = reducirLista buscarPreciosProducto

    let montoTotal= reduce + fromIntegral reduce1

    print(listaProductos)
    print("----------------------------------------------------------------------------------")
    print("Calculo de impuestos")
    putStrLn $ show "Los impuestos de su compra son:" ++ " " ++ show reduce
    putStrLn $ show "El total sin impuestos es:" ++ " " ++ show reduce1
    putStrLn $ show "El total con impuestos es:" ++ " " ++ show montoTotal

{-CONSOLA
[Producto {nombre = "Tarjeta madre", descripcion = "MSI", montoVenta = 54200},
Producto {nombre = "Mouse", descripcion = "Logitech", montoVenta = 15000},
Producto {nombre = "Memoria ssd", descripcion = "502 gb", montoVenta = 65000},
Producto {nombre = "Teclado", descripcion = "Razer", montoVenta = 30000},
Producto {nombre = "Cable HDMI", descripcion = "1mm", montoVenta = 5000},
Producto {nombre = "Camara", descripcion = "Logitech", montoVenta = 25000},
Producto {nombre = "Pantalla", descripcion = "Samsumg", montoVenta = 18000}]
----------------------------------------------------------------------------------
"Calculo de impuestos"
"Los impuestos de su compra son:" 22646.0
"El total sin impuestos es:" 212200
"El total con impuestos es:" 234846.0
-}

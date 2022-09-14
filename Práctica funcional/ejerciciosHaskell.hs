--Fecha: 12/9/2022
--Hecho por: Julieth Campos Pérez


{-Ejercicio 1:
Haciendo uso de la función filter, implemente una función que a partir de una lista de cadenas de parámetro, 
filtre aquellas que contengan una subcadena que el usuario indique en otro argumento. 
Ej:
sub_cadenas “la” [“la casa, “el perro”, “pintando la cerca”]
[“la casa, “pintando la cerca”]-}


subC     :: (Eq a) => [a] -> [a] -> Bool
subC (x:xs) (y:ys)     --x cabeza, xs cola
    | x == y = subC xs ys
    | otherwise = subC (x:xs) ys
subC [] [] = True
subC [] _ = True
subC _ [] = False


subCadenas :: String -> [String] -> [String]
subCadenas str list = filter (subC str) list

{-Ejercicio 2
Construya una función que se llame sub_conjunto. Esta función recibe dos listas y debe retornar 
True cuando el primer argumento es subconjunto completo del segundo y #f en caso contrario. Por ejemplo: 
sub_conjunto [] [1,2,3,4,5]
True
sub_conjunto [1,2,3] [1,2,3,4,5]
True
sub_conjunto [1,2,6] [1,2,3,4,5]
False-}

subConjunto :: Eq a => [a] -> [a] -> Bool
subConjunto [] _         =  True
subConjunto _  []        =  False
subConjunto (x:xs) (y:ys)=  x == y && subConjunto xs ys


{-Ejercicio 3
Implemente la función aplanar. Esta función recibe una lista con múltiples listas
anidadas como elementos y devuelve una lista con los mismos elementos de manera lineal (sin listas). Ej: 
aplanar ‘(1 2 (3 (4 5) (6 7))))
(1 2 3 4 5 6 7)-}


aplanar :: [[a]] -> [a]
aplanar [] = []
aplanar ([]:vs) = aplanar vs
aplanar ((x:xs):vs) = x:aplanar (xs:vs)

{-Ejercicio 4
Implemente el equivalente para la función anterior, pero utilizando la función map para dicho fin.-}


mapear :: (a -> b -> b) -> b -> [a] -> b

mapear a b = elem
    where
        elem [] = b
        elem (x:xs) = x `a` elem xs     --x cabeza, xs cola

aplanarMapeado :: [[x]] -> [x]
aplanarMapeado = mapear (++) []

--Mapea una funcion sobre una lista y concatena los resultados
aplanarMapeado2 :: (a -> [b]) -> [a] -> [b]
aplanarMapeado2 f =  foldr ((++) . f) []


main :: IO ()
main = do
    print "-----------------Subcadenas:"
    print $ subCadenas "la" ["la clase de lenguajes","la profesora no vino","viva el internet","soy de la zona"]
    print "-----------------Subconjunto al inicio de la lista:"
    print $ subConjunto [1,2] [1,2,3,4,5]
    print "-----------------Aplanar lista:"
    print $ aplanar [[1],[10],[2,3,4],[9,8,6]]
    print "-----------------Aplanar lista con map:"
    print $ aplanarMapeado [[1],[10],[2,3,4],[9,8,6]]
    print "-----------------Segunda alternativa aplanar con map:"
    print $ aplanarMapeado2 (++[])[[1],[10],[2,3,4],[9,8,6]]

--CONSOLA
{-"-----------------Subcadenas:"
["la clase de lenguajes","la profesora no vino","soy de la zona"]
"-----------------Subconjunto al inicio de la lista:"
True
"-----------------Aplanar lista:"
[1,10,2,3,4,9,8,6]
"-----------------Aplanar lista con map:"
[1,10,2,3,4,9,8,6]
"-----------------Segunda alternativa aplanar con map:"
[1,10,2,3,4,9,8,6]-}
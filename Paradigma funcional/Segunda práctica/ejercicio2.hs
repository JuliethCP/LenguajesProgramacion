{- EJERCICIO 2: 
2)	Modifique el ejercicio de búsqueda en profundidad para ingresar pesos a los vértices 
(una recomendación es representarlos como [["i"],["a","b"],["3","6","5"]] para evitar tener 
que cambiar algo en el algoritmo actual). Implemente una función que encuentre el camino más 
corto en la búsqueda en profundidad basándose en la sumatoria de pesos. Implica cambiar la
 búsqueda en profundidad para que se lleven los pesos además de los vértices.
-}

import Data.Ord (comparing)
import Data.List (sortBy)

combine :: [a] -> [a] -> [[a]]
combine p1 p2 = [[a,b] | (a, b) <- zip p1 p2]

convert :: [String] -> [(String, Integer)]
convert [] = []
convert (x:xs) = (x, read x :: Integer) : convert xs


member elem list =
    or (map comparison list)
    where
        comparison x = (x == elem)

remove_if fun list = 
    concat (map (\x -> if (fun x) then []
                       else [x] )
                list)

useVertices node graph = do
    let result =  concat (map (\x -> if (head (head x)) == node then [x]
                            else [] ) 
                            graph)
    if (result == []) then []
    else head (tail (head result))

expandPe rute graph =
    remove_if (==[])
    (map (\x -> if (member x rute) then []
                       else x:rute )
        (organizePesos (head rute) graph))

prof ini fin graph =
    profAux fin [[ini]] graph

organize :: [[a]] -> [a]
organize []=[]
organize [y] = y
organize (x:y:list)
 |length x > length y = organize (y:list)            
 |otherwise = organize (x:list)
 
usePe node graph = do
    let result =  concat (map (\x -> if (head(head x)) == node then [tail x]
                            else [] ) 
                            graph)
    if (result == []) then []
    else head (tail (head result))

profAux fin rutes graph =
    if rutes==[] then []
    else if (fin == (head (head rutes))) then
        reverse (head rutes):profAux fin ((expandPe (head rutes) graph)++(tail rutes)) graph
    else
        profAux fin ((expandPe (head rutes) graph)++(tail rutes)) graph
    

organizePesos node graph = do
    let {combineVecinos= combine (useVertices node graph) (usePe node graph); concatenar= concat combineVecinos; 
    convertStringInt= convert concatenar; organizeConcat= sortBy (comparing (\(x,y) -> abs y)) convertStringInt; 
    deletePe= convertStringInt >>= \(x,y) -> [x]} in deletePe

main :: IO ()
main = do
    let graph=[ [["i"],["a","b"], ["3","6"]],     
                [["a"],["i","c","d"], ["3","6","5"]], 
                [["b"],["i","c","d"], ["3","6","5"]],  
                [["c"],["a","b","x"], ["3","6","5"]],  
                [["d"],["a","b","f"], ["3","6","5"]], 
                [["f"],["d"], ["3"]],          
                [["x"],["c"], ["3"]]           
                 ] 
    
    let list=prof "i" "f" graph

    let newLista = organize list
    print("Camino mas corto de i a f:")
    print(newLista)


    {-CONSOLA:
    "Camino mas corto de i a f:"
    ["i","a","d","f"]
    -}
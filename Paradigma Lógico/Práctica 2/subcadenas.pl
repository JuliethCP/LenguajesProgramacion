prefijo(Xs,Ys) :- append(Xs,_,Ys).
sufijo(Xs,Ys) :- append(_,Xs,Ys).

substring(X,S) :-
  string_to_list(X,XLi),
  string_to_list(S,SLi),
  sufijo(T,SLi),
  prefijo(XLi,T),
  X \= [],!.

match(A,B):-
  substring(A,B).


% INCLUDE: Filter elements for which Goal succeeds. True if List2
% contains those elements Xi of List1 for which call(Goal, Xi) succeeds.
%
subCadena(Palabra, Lista, Result):-
  include(match(Palabra),Lista, Result).


%CONSOLA:
% ?- subCadena("la", ["la casa", "el perro", "pintando la
% cerca"],Resultado).
%Resultado = ["la casa", "pintando la cerca"].

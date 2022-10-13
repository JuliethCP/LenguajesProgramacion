
borde(i,a,20).
borde(i,b,10).
borde(a,c,4).
borde(a,d,7).
borde(b,c,2).
borde(c,x,10).
borde(d,b,5).
borde(f,d,15).
%            4     10
%        a ---- c ---- x
%  20  /   \  /
%     /    7\/
%   i       /\
%     \    /2 \
%  10  \  /    \
%        b ---- d ---- f
%            5      15
%los bordes son bidireccionales
conectado(X,Y,L) :- borde(X,Y,L) ; borde(Y,X,L).

camino(A,B,Path,Len) :-
       viaje(A,B,[A],Q,Len),
       reverse(Q,Path).

viaje(A,B,P,[B|P],L) :-
       conectado(A,B,L).
viaje(A,B,Visitado,Path,L) :-
       conectado(A,C,D),
       C \== B,
       \+member(C,Visitado),
       viaje(C,B,[C|Visitado],Path,L1),
       L is D+L1.

rutaCorta(A,B,Path,Length) :-
   setof([P,L],camino(A,B,P,L),Set),
   Set = [_|_], %falla si es vacio
   minimo(Set,[Path,Length]).

minimo([F|R],M) :- min(R,F,M).

% minimal path
min([],M,M).
min([[P,L]|R],[_,M],Min) :- L < M, !, min(R,[P,L],Min).
min([_|R],M,Min) :- min(R,M,Min).

%CONSOLA:
%rutaCorta(i,x,Camino,Peso).
%Camino = [i, b, c, x],
%Peso = 22.

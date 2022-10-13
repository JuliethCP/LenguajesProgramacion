subconjunto([],[]).
subconjunto([X|L1],[X|L2]) :-
subconjunto(L1,L2).
subconjunto(L1,[_|L2]) :-
subconjunto(L1,L2).


%CONSOLA:
%?- subconjunto([1],[1,2,3,4,5]).
%true .

%?- subconjunto([3],[1,2,3,4,5]).
%true

aplanar([],[]).
aplanar([X|L],S):-is_list(X),
aplanar(X,S1),
aplanar(L,S2),
append(S1,S2,S),!.
aplanar([X|L],S):-not(is_list(X)),
aplanar(L,S1),
S=[X|S1].

%CONSOLA
%?- aplanar([1,2,[3,[4,5],[6,7]]],Resultado).
%Resultado = [1, 2, 3, 4, 5, 6, 7].
%

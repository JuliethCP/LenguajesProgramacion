eliminar(_, [], []).
eliminar(Y, [Y|Xs], Zs) :-
    eliminar(Y, Xs, Zs),
    !.
eliminar(X, [Y|Xs], [Y|Zs]) :-
    eliminar(X, Xs, Zs).

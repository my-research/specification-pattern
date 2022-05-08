package com.example;

import java.util.function.Function;

public interface What<T, R> {
    Function<T, R> function();
    /*default R doWhat(T t) {
        return function().apply(t);
    }*/
}

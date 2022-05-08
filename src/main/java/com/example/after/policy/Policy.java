package com.example.after.policy;

import com.example.after.condition.Condition;
import java.util.function.Function;

public interface Policy<T, R> {
    Function<T, R> func();

    boolean isSatisfiedBy(T t);

    default R resultBy(T t) {
        return func().apply(t);
    }
}

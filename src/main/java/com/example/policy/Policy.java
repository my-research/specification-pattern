package com.example.policy;

import com.example.domain.Factor;
import java.util.function.Function;

public interface Policy<T, R> {
    boolean isSatisfiedBy(Factor factor);
    Function<T, R> what();

    default R resultBy(T t) {
        return what().apply(t);
    }
}

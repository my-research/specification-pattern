package com.example.before.policy;

import com.example.before.domain.Factor;
import java.util.function.Function;

public interface Policy<T, R> {
    boolean isSatisfiedBy(Factor factor);
    Function<T, R> what();

    default R resultBy(T t) {
        return what().apply(t);
    }
}

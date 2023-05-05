package com.github.dhslrl321.specification.core;

import com.github.dhslrl321.Factor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Not implements Condition{

    private final Condition condition;

    @Override
    public boolean isSatisfiedBy(Factor factor) {
        return !condition.isSatisfiedBy(factor);
    }
}

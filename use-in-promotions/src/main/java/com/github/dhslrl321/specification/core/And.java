package com.github.dhslrl321.specification.core;

import com.github.dhslrl321.Factor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class And implements Condition{

    private final Condition left;
    private final Condition right;

    @Override
    public boolean isSatisfiedBy(Factor factor) {
        return left.isSatisfiedBy(factor)
                && right.isSatisfiedBy(factor);
    }
}

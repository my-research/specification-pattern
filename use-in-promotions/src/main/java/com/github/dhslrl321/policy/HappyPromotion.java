package com.github.dhslrl321.policy;

import com.github.dhslrl321.Factor;
import com.github.dhslrl321.specification.core.Condition;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HappyPromotion implements Promotion {
    private final Condition condition;
    private final Benefit benefit;

    @Override
    public Benefit getBenefit(Factor factor) {
        if (condition.isSatisfiedBy(factor)) {
            return this.benefit;
        }
        return null;
    }
}
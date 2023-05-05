package com.github.dhslrl321.specification;

import com.github.dhslrl321.Factor;
import com.github.dhslrl321.specification.core.Condition;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class MaxPriceCondition implements Condition {

    public static MaxPriceCondition maxPriceOver(long baseAmount) {
        return new MaxPriceCondition(baseAmount);
    }

    private final long baseAmount;

    @Override
    public boolean isSatisfiedBy(Factor factor) {
        return factor.getPaidAmount() >= baseAmount;
    }
}

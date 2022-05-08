package com.example.after.condition;

import static com.example.after.domain.PaymentType.CARD;

import com.example.after.domain.PaymentFactor;

public class CardDiscountCondition implements Condition<PaymentFactor> {

    @Override
    public boolean isSatisfiedBy(PaymentFactor factor) {
        return CARD.equals(factor.getType());
    }
}

package com.example.after.condition;

import static com.example.after.domain.PaymentType.CASH;

import com.example.after.domain.PaymentFactor;

public class CashDiscountCondition implements Condition<PaymentFactor> {

    @Override
    public boolean isSatisfiedBy(PaymentFactor factor) {
        return CASH.equals(factor.getType());
    }
}

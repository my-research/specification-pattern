package com.example.after.application;

import com.example.after.condition.CardDiscountCondition;
import com.example.after.condition.CashDiscountCondition;
import com.example.after.domain.Fee;
import com.example.after.domain.PaymentAmount;
import com.example.after.policy.PaymentPolicy;
import java.util.List;

public class PaymentAmountCalculator {

    private final List<PaymentPolicy> policies;

    public PaymentAmountCalculator(List<PaymentPolicy> policies) {
        this.policies = policies;
        policies.add(PaymentPolicy.of(new CardDiscountCondition(), (Void) -> Fee.of(10)));
        policies.add(PaymentPolicy.of(new CashDiscountCondition(), (Void) -> Fee.of(20)));
    }

    public PaymentAmount calculate() {
        for (PaymentPolicy policy : policies) {

        }
        return null;
    }
}

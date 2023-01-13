package com.example.after.policy;

import com.example.after.condition.Condition;
import com.example.after.domain.Fee;
import com.example.after.domain.PaymentAmount;
import com.example.after.domain.PaymentFactor;
import com.example.after.domain.PaymentType;
import java.util.function.Function;
import lombok.Value;

@Value(staticConstructor = "of")
public class PaymentPolicy implements Policy<PaymentFactor, Fee> {

    Condition<PaymentFactor> condition;
    Function<PaymentFactor, Fee> function;

    @Override
    public Function<PaymentFactor, Fee> func() {
        return function;
    }

    @Override
    public boolean isSatisfiedBy(PaymentFactor factor) {
        return condition.isSatisfiedBy(factor);
    }
}

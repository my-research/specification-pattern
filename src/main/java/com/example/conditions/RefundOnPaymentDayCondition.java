package com.example.conditions;

import com.example.Factor;
import java.time.LocalDateTime;
import lombok.Value;

@Value(staticConstructor = "of")
public class RefundOnPaymentDayCondition implements Specification {
    @Override
    public boolean isSatisfiedBy(Factor factor) {
        LocalDateTime confirmedAt = factor.getConfirmedAt();
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime last24Hour = confirmedAt.minusDays(1L);
        return last24Hour.isBefore(now);
    }
}

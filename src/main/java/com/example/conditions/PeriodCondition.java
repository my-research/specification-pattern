package com.example.conditions;

import com.example.Factor;
import com.example.model.Period;
import java.time.LocalDateTime;
import lombok.Value;

@Value(staticConstructor = "of")
public class PeriodCondition implements Specification {

    Period period;

    @Override
    public boolean isSatisfiedBy(Factor factor) {
        LocalDateTime now = factor.getNow();
        LocalDateTime startedAt = period.getStartedAt();
        LocalDateTime beginPeriod = startedAt.minusDays(8L);

        return now.isBefore(beginPeriod);
    }
}

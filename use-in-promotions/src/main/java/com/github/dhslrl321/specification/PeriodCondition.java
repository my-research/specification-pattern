package com.github.dhslrl321.specification;

import com.github.dhslrl321.Factor;
import com.github.dhslrl321.specification.core.Condition;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class PeriodCondition implements Condition {

    public static PeriodCondition periodBetween(LocalDateTime start, LocalDateTime end) {
        return new PeriodCondition(start, end);
    }

    private final LocalDateTime start;
    private final LocalDateTime end;

    @Override
    public boolean isSatisfiedBy(Factor factor) {
        LocalDateTime purchasedAt = factor.getPurchasedAt();

        return purchasedAt.isAfter(start)
                && purchasedAt.isBefore(end);
    }
}

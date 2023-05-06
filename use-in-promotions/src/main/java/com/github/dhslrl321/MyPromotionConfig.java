package com.github.dhslrl321;

import com.github.dhslrl321.promotion.Benefit;
import com.github.dhslrl321.promotion.SimplePromotion;
import com.github.dhslrl321.promotion.Promotion;
import com.github.dhslrl321.specification.core.Condition;
import com.github.dhslrl321.specification.core.Conditions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.github.dhslrl321.specification.AgeCondition.ageOver;
import static com.github.dhslrl321.specification.MaxPriceCondition.maxPriceOver;
import static com.github.dhslrl321.specification.PeriodCondition.periodBetween;
import static com.github.dhslrl321.specification.core.Conditions.*;

public class MyPromotionConfig {
    final List<Promotion> promotions = new ArrayList<>();

    public void init() {
        promotions.add(happyPromotion());
        promotions.add(soongjamPromotion());
    }

    private Promotion happyPromotion() {
        Condition 발동조건 = AND(
                AND(
                        ageOver(19),
                        maxPriceOver(210_000)
                ),
                periodBetween(dayOf(2022, 1, 1), dayOf(2023, 5, 31))
        );

        Benefit benefit = Benefit.of("RATE", 100);

        return new SimplePromotion(발동조건, benefit);
    }

    private Promotion soongjamPromotion() {
        Condition 발동조건 = OR(
                ageOver(80),
                AND(
                        OR(ageOver(19), NOT(maxPriceOver(210_000))),
                        periodBetween(dayOf(2022, 1, 1), dayOf(2023, 5, 31))
                ));

        Benefit benefit = Benefit.of("RATE", 100);

        return new SimplePromotion(발동조건, benefit);
    }

    private LocalDateTime dayOf(int year, int month, int day) {
        return LocalDateTime.of(year, month, day, 0, 0, 0);
    }
}

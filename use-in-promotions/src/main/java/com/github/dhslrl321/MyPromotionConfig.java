package com.github.dhslrl321;

import com.github.dhslrl321.policy.Benefit;
import com.github.dhslrl321.policy.HappyPromotion;
import com.github.dhslrl321.policy.Promotion;
import com.github.dhslrl321.specification.AgeCondition;
import com.github.dhslrl321.specification.MaxPriceCondition;
import com.github.dhslrl321.specification.PeriodCondition;
import com.github.dhslrl321.specification.core.Condition;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.github.dhslrl321.specification.AgeCondition.ageOver;
import static com.github.dhslrl321.specification.MaxPriceCondition.maxPriceOver;
import static com.github.dhslrl321.specification.PeriodCondition.periodBetween;
import static com.github.dhslrl321.specification.core.Conditions.AND;

public class MyPromotionConfig {
    private final List<Promotion> promotions = new ArrayList<>();

    public void init() {
        promotions.add(happyPromotion());
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

        return new HappyPromotion(발동조건, benefit);
    }

    private LocalDateTime dayOf(int year, int month, int day) {
        return LocalDateTime.of(year, month, day, 0, 0, 0);
    }
}

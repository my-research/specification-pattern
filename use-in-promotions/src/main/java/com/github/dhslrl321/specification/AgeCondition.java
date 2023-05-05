package com.github.dhslrl321.specification;

import com.github.dhslrl321.Factor;
import com.github.dhslrl321.specification.core.Condition;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AgeCondition implements Condition {

    public static AgeCondition ageOver(int age) {
        return new AgeCondition(age);
    }

    private final int age;

    @Override
    public boolean isSatisfiedBy(Factor factor) {
        return age < factor.getAge();
    }
}

package com.example.condition;

import com.example.domain.Factor;

public class StudentCondition implements Condition {

    @Override
    public boolean isSatisfiedBy(Factor factor) {
        String name = factor.getName();
        return "student".equals(name);
    }
}

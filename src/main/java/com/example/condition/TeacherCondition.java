package com.example.condition;

import com.example.domain.Factor;

public class TeacherCondition implements Condition {
    @Override
    public boolean isSatisfiedBy(Factor factor) {
        String name = factor.getName();
        return "teacher".equals(name);
    }
}

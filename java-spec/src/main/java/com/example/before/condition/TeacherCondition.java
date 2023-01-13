package com.example.before.condition;

import com.example.before.domain.Factor;

public class TeacherCondition implements Condition {
    @Override
    public boolean isSatisfiedBy(Factor factor) {
        String name = factor.getName();
        return "teacher".equals(name);
    }
}

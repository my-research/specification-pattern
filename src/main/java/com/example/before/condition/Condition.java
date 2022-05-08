package com.example.before.condition;

import com.example.before.domain.Factor;

public interface Condition {
    boolean isSatisfiedBy(Factor factor);
}

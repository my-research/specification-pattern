package com.example.condition;

import com.example.domain.Factor;

public interface Condition {
    boolean isSatisfiedBy(Factor factor);
}

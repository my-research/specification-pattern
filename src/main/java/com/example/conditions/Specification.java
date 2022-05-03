package com.example.conditions;

import com.example.Factor;

public interface Specification {
    boolean isSatisfiedBy(Factor factor);
}

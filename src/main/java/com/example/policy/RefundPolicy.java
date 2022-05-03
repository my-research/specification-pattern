package com.example.policy;

import com.example.conditions.PeriodCondition;
import lombok.Value;

@Value(staticConstructor = "of")
public class RefundPolicy {
    PeriodCondition condition;
    int fee;
}

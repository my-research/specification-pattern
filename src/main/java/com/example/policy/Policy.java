package com.example.policy;

import com.example.conditions.Specification;
import com.example.model.FeeRate;
import lombok.Value;

@Value(staticConstructor = "of")
public class Policy {
    Specification condition;
    FeeRate feeRate;
}

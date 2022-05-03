package com.example.policy;

import com.example.conditions.Specification;
import lombok.Value;

@Value(staticConstructor = "of")
public class RefundPolicy {
    Specification condition; // 조건
    int fee; // 무엇
}

package com.example;

import com.example.policy.RefundPolicy;
import lombok.Value;

@Value(staticConstructor = "of")
public class Abc {

    RefundPolicy policy;

    public int getRefundRate(Factor factor) {
        return 0;
    }
}

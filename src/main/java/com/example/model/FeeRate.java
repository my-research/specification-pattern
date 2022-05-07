package com.example.model;

import lombok.Value;

@Value(staticConstructor = "of")
public class FeeRate {
    int value;
}

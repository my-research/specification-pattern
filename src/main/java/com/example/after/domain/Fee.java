package com.example.after.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class Fee {
    int value;
}

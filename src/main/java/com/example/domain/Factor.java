package com.example.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class Factor {
    String name;
}

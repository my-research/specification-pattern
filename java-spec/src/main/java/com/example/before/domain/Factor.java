package com.example.before.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class Factor {
    String name;
}

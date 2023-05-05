package com.github.dhslrl321.policy;

import lombok.Value;

@Value(staticConstructor = "of")
public class Benefit {
    String type;
    long value;
}

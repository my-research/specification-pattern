package com.github.dhslrl321.promotion;

import lombok.Value;

@Value(staticConstructor = "of")
public class Benefit {
    String type;
    long value;
}

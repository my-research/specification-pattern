package com.github.dhslrl321.specification.core;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Conditions {

    public static Condition AND(Condition c1, Condition c2) {
        return new And(c1, c2);
    }

    public static Condition OR(Condition c1, Condition c2) {
        return new Or(c1, c2);
    }

    public static Condition NOT(Condition condition) {
        return new Not(condition);
    }
}

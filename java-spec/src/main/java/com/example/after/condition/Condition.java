package com.example.after.condition;

public interface Condition<F> {
    boolean isSatisfiedBy(F factor);
}

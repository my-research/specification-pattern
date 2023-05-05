package com.github.dhslrl321;

import lombok.Value;

import java.time.LocalDateTime;

@Value(staticConstructor = "of")
public class Factor {

    public static Factor nowOf(long amount) {
        return Factor.of(LocalDateTime.now(), amount, 10);
    }

    LocalDateTime purchasedAt;
    long paidAmount;
    int age;
}

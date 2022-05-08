package com.example;

import java.util.function.Function;

public class DoWhat implements What<ABC, DEF> {
    @Override
    public Function<ABC, DEF> function() {
        System.out.println("DoWhat's function implementation");
        return null;
    }
}

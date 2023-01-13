package com.example.before.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class Identity {
    String id;
    String role;
}

package com.example.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class Identity {
    String id;
    String role;
}

package com.example.model;

import java.time.LocalDateTime;
import lombok.Value;

@Value(staticConstructor = "of")
public class Period {
    LocalDateTime startedAt;
    LocalDateTime endedAt;
}

package com.example;

import java.time.LocalDateTime;
import lombok.Value;

@Value(staticConstructor = "of")
public class Factor {
    Long clubId;
    LocalDateTime confirmedAt;
}

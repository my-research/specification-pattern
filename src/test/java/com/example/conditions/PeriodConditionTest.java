package com.example.conditions;

import static org.junit.jupiter.api.Assertions.*;

import com.example.model.Period;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PeriodConditionTest {

    PeriodCondition sut;

    @BeforeEach
    void setUp() {
        Period period = Period.of(LocalDateTime.now().minusDays(7L), LocalDateTime.now());
        sut = PeriodCondition.of(period);
    }

    @Test
    void name() {

    }
}
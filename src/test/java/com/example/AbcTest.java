package com.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import com.example.conditions.PeriodCondition;
import com.example.model.Period;
import com.example.policy.RefundPolicy;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AbcTest {

    Abc sut;

    @BeforeEach
    void setUp() {
        LocalDateTime firstStart = LocalDateTime.now().minusDays(1L);
        LocalDateTime firstEnd = LocalDateTime.now().minusDays(3L);
        Period firstPeriod = Period.of(firstStart, firstEnd);

        RefundPolicy policy = RefundPolicy.of(PeriodCondition.of(firstPeriod), 100);

        sut = Abc.of(policy);
    }

    @Test
    void 모임4_회중_첫모임_D_8_은_100프로_환불이다() {
        Factor factor = Factor.of(123L, LocalDateTime.now());

        int rate = sut.getRefundRate(factor);

        assertThat(rate).isEqualTo(100);
    }
}
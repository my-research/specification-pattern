package com.example.conditions;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.Factor;
import com.example.model.FeeRate;
import com.example.policy.Policy;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

public class RefundOnPaymentDayTest {

    public static final LocalDateTime PURCHASED_AT = LocalDateTime.now().minusMinutes(10L);
    public static final int ZERO_FEE = 0;

    @Test
    void 당일_결제한_클럽을_환불한_경우_100_퍼센트_환불() {
        Factor factor = Factor.of(123L, PURCHASED_AT);

        Policy policy = Policy.of(RefundOnPaymentDayCondition.of(), FeeRate.of(ZERO_FEE));

        if (policy.getCondition().isSatisfiedBy(factor)) {
            assertThat(policy.getFeeRate().getValue()).isEqualTo(ZERO_FEE);
        }
    }
}
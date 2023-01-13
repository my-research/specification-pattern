package com.example.after.condition;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.example.after.domain.PaymentFactor;
import com.example.after.domain.PaymentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;
import org.junit.jupiter.params.provider.ValueSource;

class CardDiscountConditionTest {

    CardDiscountCondition sut;

    @BeforeEach
    void setUp() {
        sut = new CardDiscountCondition();
    }

    @Test
    void 결제수단이_CARD() {
        PaymentFactor factor = new PaymentFactor(PaymentType.CARD);
        boolean actual = sut.isSatisfiedBy(factor);

        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @EnumSource(value = PaymentType.class, names = {"CARD"}, mode = Mode.EXCLUDE)
    void 결제수단이_CARD_가_아닌_그외(PaymentType type) {
        PaymentFactor factor = new PaymentFactor(type);

        boolean actual = sut.isSatisfiedBy(factor);

        assertThat(actual).isFalse();
    }
}
package com.github.dhslrl321.specification;

import com.github.dhslrl321.Factor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxPriceConditionTest {

    MaxPriceCondition sut;

    @Test
    void name() {

        sut = new MaxPriceCondition(9000);

        Factor factor = Factor.nowOf(1000);

        assertThat(sut.isSatisfiedBy(factor)).isFalse();
    }
}
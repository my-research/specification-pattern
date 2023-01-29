package com.github.dhslrl321.condition.general

class AndCondition<FACTOR>(
    private val left: Condition<FACTOR>,
    private val right: Condition<FACTOR>
): Condition<FACTOR> {
    override fun isSatisfiedBy(factor: FACTOR): Boolean =
        left.isSatisfiedBy(factor) && right.isSatisfiedBy(factor)
}
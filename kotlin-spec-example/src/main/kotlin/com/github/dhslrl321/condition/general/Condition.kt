package com.github.dhslrl321.condition.general

interface Condition<FACTOR> {
    fun isSatisfiedBy(factor: FACTOR): Boolean
}
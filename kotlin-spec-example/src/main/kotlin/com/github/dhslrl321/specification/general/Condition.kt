package com.github.dhslrl321.specification.general

interface Condition<FACTOR> {
    fun isSatisfiedBy(factor: FACTOR): Boolean
}
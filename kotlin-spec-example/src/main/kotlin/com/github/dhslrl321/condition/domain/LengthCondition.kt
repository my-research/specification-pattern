package com.github.dhslrl321.condition.domain

import com.github.dhslrl321.condition.general.Condition
import com.github.dhslrl321.notifier.Notification

class LengthCondition(
    private val length: Int,
): Condition<Notification> {
    override fun isSatisfiedBy(factor: Notification): Boolean {
        return factor.content.length <= length
    }
}


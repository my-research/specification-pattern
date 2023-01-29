package com.github.dhslrl321.condition.domain

import com.github.dhslrl321.condition.general.Condition
import com.github.dhslrl321.notifier.Notification

class NotificationTypeCondition(
    private val type: String
): Condition<Notification> {
    override fun isSatisfiedBy(factor: Notification): Boolean =
        factor.type == type
}
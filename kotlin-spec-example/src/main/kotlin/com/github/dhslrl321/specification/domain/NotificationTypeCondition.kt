package com.github.dhslrl321.specification.domain

import com.github.dhslrl321.specification.general.Condition
import com.github.dhslrl321.notifier.Notification

class NotificationTypeCondition(
    private val type: String
): Condition<Notification> {
    override fun isSatisfiedBy(factor: Notification): Boolean =
        factor.type == type
}


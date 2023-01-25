package com.github.dhslrl321.refactor.spec

import com.github.dhslrl321.notifier.Notification

class NotificationTypeCondition(
    private val type: String,
) : Condition {
    override fun isSatisfiedBy(notification: Notification): Boolean =
        notification.type == type
}
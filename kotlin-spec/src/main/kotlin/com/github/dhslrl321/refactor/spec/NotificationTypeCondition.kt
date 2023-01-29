package com.github.dhslrl321.refactor.spec

import com.github.dhslrl321.notifier.Notification

class NotificationTypeSpecification(
    private val type: String,
) : Specification {
    override fun isSatisfiedBy(notification: Notification): Boolean =
        notification.type == type
}
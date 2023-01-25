package com.github.dhslrl321.refactor.spec

import com.github.dhslrl321.notifier.Notification

class NumberCondition(
    private val prefix: String,
) : Condition {
    override fun isSatisfiedBy(notification: Notification): Boolean =
        notification.to.startsWith(prefix)
}
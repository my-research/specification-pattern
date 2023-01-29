package com.github.dhslrl321.refactor.spec

import com.github.dhslrl321.notifier.Notification

class NumberSpecification(
    private val prefix: String,
) : Specification {
    override fun isSatisfiedBy(notification: Notification): Boolean =
        notification.to.startsWith(prefix)
}
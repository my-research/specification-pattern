package com.github.dhslrl321.refactor.spec

import com.github.dhslrl321.notifier.Notification

class AndCondition(
    private val left: Condition,
    private val right: Condition
): Condition {

    override fun isSatisfiedBy(notification: Notification): Boolean =
        left.isSatisfiedBy(notification) && right.isSatisfiedBy(notification)
}
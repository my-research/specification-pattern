package com.github.dhslrl321.refactor.spec

import com.github.dhslrl321.notifier.Notification

class AndSpecification(
    private val left: Specification,
    private val right: Specification
): Specification {

    override fun isSatisfiedBy(notification: Notification): Boolean =
        left.isSatisfiedBy(notification) && right.isSatisfiedBy(notification)
}
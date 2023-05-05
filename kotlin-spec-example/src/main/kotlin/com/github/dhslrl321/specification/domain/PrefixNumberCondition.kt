package com.github.dhslrl321.specification.domain

import com.github.dhslrl321.specification.general.Condition
import com.github.dhslrl321.notifier.Notification

class PrefixNumberCondition(
    private val prefix: String,
) : Condition<Notification> {
    override fun isSatisfiedBy(factor: Notification): Boolean =
        factor.to.startsWith(prefix)
}


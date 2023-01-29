package com.github.dhslrl321.refactor.spec

import com.github.dhslrl321.notifier.Notification

interface Condition {
    fun isSatisfiedBy(notification: Notification): Boolean
}
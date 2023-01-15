package com.github.dhslrl321.refactor.spec

import com.github.dhslrl321.legacy.Notification

class UsaNumberCondition: Condition {
    override fun isSatisfiedBy(notification: Notification): Boolean {
        return notification.to.startsWith("+1")
    }
}
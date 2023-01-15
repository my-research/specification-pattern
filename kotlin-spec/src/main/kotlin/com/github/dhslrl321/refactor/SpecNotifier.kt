package com.github.dhslrl321.refactor

import com.github.dhslrl321.legacy.Notification
import com.github.dhslrl321.legacy.Notifier
import com.github.dhslrl321.refactor.spec.Condition
import com.github.dhslrl321.refactor.spec.NotificationTypeCondition
import com.github.dhslrl321.refactor.spec.NumberCondition

class SpecNotifier(
    val condition: Condition
): Notifier {
    override fun doNotify(notification: Notification) {
        val notificationTypeCondition = NotificationTypeCondition("SMS")
        NumberCondition("+82")
    }
}
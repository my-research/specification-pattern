package com.github.dhslrl321.notifier

import com.github.dhslrl321.condition.general.Condition

class ToastNotifier(
    private val condition: Condition<Notification>
) : Notifier {
    override fun doNotify(notification: Notification) {
        println("notify by nhn toast \nbody: [$notification]\n")
    }

    override fun isSupport(notification: Notification): Boolean {
        return condition.isSatisfiedBy(notification)
    }
}
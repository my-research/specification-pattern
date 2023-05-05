package com.github.dhslrl321.notifier

import com.github.dhslrl321.specification.general.Condition

class ToastNotifier(
    private val spec: Condition<Notification>
) : Notifier {
    override fun doNotify(notification: Notification) {
        println("notify by nhn toast \nbody: [$notification]\n")
    }

    override fun isSupport(notification: Notification): Boolean {
        return spec.isSatisfiedBy(notification)
    }
}


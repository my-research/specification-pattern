package com.github.dhslrl321.notifier

import com.github.dhslrl321.condition.general.Condition

class TwilioNotifier(
    private val spec: Condition<Notification>
) : Notifier {
    override fun doNotify(notification: Notification) {
        println("notify by twilio \nbody: [$notification]\n")
    }

    override fun isSupport(notification: Notification): Boolean {
        return spec.isSatisfiedBy(notification)
    }
}
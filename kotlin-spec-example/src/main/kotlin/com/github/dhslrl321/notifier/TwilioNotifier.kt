package com.github.dhslrl321.notifier

import com.github.dhslrl321.condition.general.Condition
import java.lang.IllegalArgumentException

class TwilioNotifier(
    private val condition: Condition<Notification>
) : Notifier {
    override fun doNotify(notification: Notification) {
        println("notify by twilio \nbody: [$notification]\n")
    }

    override fun isSupport(notification: Notification): Boolean {
        return condition.isSatisfiedBy(notification)
    }
}
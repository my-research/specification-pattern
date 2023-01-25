package com.github.dhslrl321.notifier

import java.lang.IllegalArgumentException

class TwilioNotifier : Notifier {
    override fun doNotify(notification: Notification) {
        println("notify by twilio \nbody: [$notification]\n")
    }

    override fun isSupport(notification: Notification): Boolean {
        return "SMS" == notification.type &&
                notification.to.startsWith("+1")
    }
}
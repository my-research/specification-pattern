package com.github.dhslrl321.legacy

class TwilioNotifier: Notifier {
    override fun doNotify(notification: Notification) {
        println("notify by twilio \nbody: [$notification]\n")
    }
}
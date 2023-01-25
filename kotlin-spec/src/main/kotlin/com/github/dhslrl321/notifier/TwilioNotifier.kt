package com.github.dhslrl321.notifier

class TwilioNotifier : Notifier {
    override fun doNotify(notification: Notification) {
        println("notify by twilio \nbody: [$notification]\n")
    }
}
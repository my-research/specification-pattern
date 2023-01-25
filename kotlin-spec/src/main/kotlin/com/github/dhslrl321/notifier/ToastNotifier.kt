package com.github.dhslrl321.notifier

class ToastNotifier : Notifier {
    override fun doNotify(notification: Notification) {
        println("notify by nhn toast \nbody: [$notification]\n")
    }

    override fun isSupport(notification: Notification): Boolean {
        return "SMS" == notification.type &&
                notification.to.startsWith("+82")
    }
}
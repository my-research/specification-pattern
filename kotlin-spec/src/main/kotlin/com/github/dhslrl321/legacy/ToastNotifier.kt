package com.github.dhslrl321.legacy

class ToastNotifier: Notifier {
    override fun doNotify(notification: Notification) {
        println("notify by nhn toast \nbody: [$notification]\n")
    }
}
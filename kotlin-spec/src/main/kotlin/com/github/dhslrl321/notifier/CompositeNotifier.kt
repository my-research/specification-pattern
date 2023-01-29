package com.github.dhslrl321.notifier

class CompositeNotifier(
    notifiers: List<Notifier>
): Notifier {
    override fun doNotify(notification: Notification) {
        TODO("Not yet implemented")
    }

    override fun isSupport(notification: Notification): Boolean {
        TODO("Not yet implemented")
    }
}
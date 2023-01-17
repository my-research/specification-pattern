package com.github.dhslrl321.legacy

import java.lang.IllegalArgumentException

class SimpleNotifier(
    private val notifiers: List<Notifier>
): Notifier {
    override fun doNotify(notification: Notification) {
        if (notification.type == "SMS") {
            if (notification.to.startsWith("+82")) {
                val notifier = notifiers.filterIsInstance<TwilioNotifier>().first()
                notifier.doNotify(notification)
            } else if (notification.to.startsWith("010")) {
                val notifier = notifiers.filterIsInstance<ToastNotifier>().first()
                notifier.doNotify(notification)
            } else {
                throw IllegalArgumentException("메시지를 지원하지 않는 번호입니다")
            }
        } else if (notification.type == "mail") {
            // TODO Impl
        } else {
            throw IllegalArgumentException("메시지를 지원하지 않는 타입입니다")
        }
    }
}

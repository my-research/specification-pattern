package com.github.dhslrl321.service

import com.github.dhslrl321.notifier.Notification
import com.github.dhslrl321.notifier.Notifier

class NotifierService(
    private val notifiers: List<Notifier>,
) {
    fun doNotify(notification: Notification) {
        val notifier = notifiers.first { it.isSupport(notification) }
        notifier.doNotify(notification)
    }
}
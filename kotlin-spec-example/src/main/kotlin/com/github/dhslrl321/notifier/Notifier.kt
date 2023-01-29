package com.github.dhslrl321.notifier

interface Notifier {
    fun doNotify(notification: Notification)

    fun isSupport(notification: Notification): Boolean
}
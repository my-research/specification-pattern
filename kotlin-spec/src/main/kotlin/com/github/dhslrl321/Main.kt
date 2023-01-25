package com.github.dhslrl321

import com.github.dhslrl321.notifier.Notification
import com.github.dhslrl321.notifier.NotifierContainer
import com.github.dhslrl321.notifier.ToastNotifier
import com.github.dhslrl321.notifier.TwilioNotifier

fun main() {
    val notifier = initNotifier()

    val notifications = generateNotifications()

    notifier.doNotify(notifications[1])
}

private fun initNotifier() = NotifierContainer(listOf(ToastNotifier(), TwilioNotifier()))

private fun generateNotifications(): List<Notification> = listOf(
    Notification(
        "SMS", "010-2537-2680",
        content = "안녕하세요 테스트입니다"
    ),
    Notification(
        "SMS", "+1-10-2537-2680",
        content = "hello this is test message"
    )
)

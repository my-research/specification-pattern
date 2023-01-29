package com.github.dhslrl321

import com.github.dhslrl321.notifier.Notification
import com.github.dhslrl321.notifier.ToastNotifier
import com.github.dhslrl321.notifier.TwilioNotifier
import com.github.dhslrl321.refactor.spec.AndCondition
import com.github.dhslrl321.service.NotifierService

fun main() {

    AndCondition()

    // NotifierService(listOf(ToastNotifier(), TwilioNotifier()));

    val notifications = generateNotifications()

    // notifier.doNotify(notifications[1])
}

// private fun initNotifier() = NotifierService(listOf(ToastNotifier(), TwilioNotifier()))

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

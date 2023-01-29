package com.github.dhslrl321

import com.github.dhslrl321.config.ApplicationBeanConfig
import com.github.dhslrl321.notifier.Notification
import com.github.dhslrl321.service.NotifierService

fun main() {
    val service = NotifierService(ApplicationBeanConfig().initNotifiers())

    val notifications = generateNotifications()

    service.doNotify(notifications[0])
}

private fun generateNotifications(): List<Notification> = listOf(
    Notification(
        "SMS", "+8210-2537-2680",
        content = "안녕하세요 테스트입니다"
    ),
    Notification(
        "SMS", "+1-10-2537-2680",
        content = "hello this is test message"
    )
)

package com.github.dhslrl321.notifier

data class Notification(
    val type: String,
    val to: String,
    val content: String,
)
package com.github.dhslrl321.config

import com.github.dhslrl321.condition.general.AndCondition
import com.github.dhslrl321.condition.domain.NotificationTypeCondition
import com.github.dhslrl321.condition.domain.PrefixNumberCondition
import com.github.dhslrl321.notifier.Notifier
import com.github.dhslrl321.notifier.ToastNotifier
import com.github.dhslrl321.notifier.TwilioNotifier

class ApplicationBeanConfig {
    fun initNotifiers(): List<Notifier> {
        return listOf(toastNotifier(), twilioNotifier())
    }

    private fun toastNotifier(): Notifier {
        val typeCondition = NotificationTypeCondition("SMS")
        val prefixCondition = PrefixNumberCondition("+82")

        val typeAndPrefix = AndCondition(typeCondition, prefixCondition)
        return ToastNotifier(typeAndPrefix)
    }

    private fun twilioNotifier(): Notifier {
        val typeCondition = NotificationTypeCondition("SMS")
        val prefixCondition = PrefixNumberCondition("+1")

        val typeAndPrefix = AndCondition(typeCondition, prefixCondition)
        return TwilioNotifier(typeAndPrefix)
    }
}
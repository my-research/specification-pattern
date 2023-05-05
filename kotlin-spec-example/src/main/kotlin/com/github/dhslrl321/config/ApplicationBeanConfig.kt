package com.github.dhslrl321.config

import com.github.dhslrl321.specification.domain.LengthCondition
import com.github.dhslrl321.specification.general.AndCondition
import com.github.dhslrl321.specification.domain.NotificationTypeCondition
import com.github.dhslrl321.specification.domain.PrefixNumberCondition
import com.github.dhslrl321.notifier.Notifier
import com.github.dhslrl321.notifier.ToastNotifier
import com.github.dhslrl321.notifier.TwilioNotifier

class ApplicationBeanConfig {
    fun initNotifiers(): List<Notifier> {
        return listOf(toastNotifier(), twilioNotifier())
    }

    private fun toastNotifier(): Notifier {
        return ToastNotifier(
            spec = AndCondition(
                AndCondition(
                    NotificationTypeCondition("SMS"),
                    PrefixNumberCondition("+82")
                ),
                LengthCondition(32)
            )
        )
    }

    private fun twilioNotifier(): Notifier {
        return TwilioNotifier(
            spec = AndCondition(
                NotificationTypeCondition("SMS"),
                PrefixNumberCondition("+1")
            )
        )
    }
}


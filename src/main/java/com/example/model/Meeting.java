package com.example.model;

import com.example.conditions.PeriodCondition;
import com.example.conditions.Specification;
import lombok.Value;

@Value(staticConstructor = "of")
public class Meeting {
    Long meetingId;
    Period period;
    int order;

    public Specification toCondition() {
        return PeriodCondition.of(period);
    }
}

package com.example.conditions;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.Factor;
import com.example.model.FeeRate;
import com.example.model.Meeting;
import com.example.model.Period;
import com.example.policy.Policy;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class PeriodTest2 {

    private static final LocalDateTime NOW = LocalDateTime.now();
    public static final int FEE_QUARTER = 25;

    @Test
    void 기간에_따른_환불() {
        // 환불을 하려는 시점에 발생하는 Factor
        Factor factor = Factor.of(123L, LocalDateTime.now().minusMinutes(10L));

        // clubId 로 meeting 조회
        List<Meeting> meetings = loadMeetingsByMembershipId(123L);

        // meeting 을 policy 로 변경
        List<Policy> policies = convertMeetingToPolicy(meetings);

        Optional<Policy> first = policies.stream()
                .filter(policy -> policy.getCondition().isSatisfiedBy(factor))
                .findFirst();

        Policy policy = first.get();

        int fee = policy.getFeeRate().getValue();

        assertThat(fee).isEqualTo(FEE_QUARTER);
    }

    public static List<Policy> convertMeetingToPolicy(List<Meeting> meetings) {
        // logic (100 / 미팅 수) * (n 번째 모임) => feeRate
        int meetingCount = meetings.size();

        List<Policy> candidates = new ArrayList<>();

        for (int i = 0; i < meetingCount; i++) {
            int refundRate = (100 / meetingCount) * (i);
            FeeRate feeRate = FeeRate.of(refundRate);
            Meeting meeting = meetings.get(i);
            Specification condition = meeting.toCondition();
            candidates.add(Policy.of(condition, feeRate));
        }

        return candidates;
    }

    public static List<Meeting> loadMeetingsByMembershipId(Long membershipId) {
        Period firstMeeting = Period.of(NOW.minusDays(14), NOW.minusDays(7));
        Period secondMeeting = Period.of(NOW.plusDays(17), NOW.plusDays(24));
        Period thirdMeeting = Period.of(NOW.plusDays(30), NOW.plusDays(34));
        Period fourthMeeting = Period.of(NOW.plusDays(40), NOW.plusDays(44));

        return List.of(Meeting.of(membershipId, firstMeeting),
                Meeting.of(membershipId, secondMeeting),
                Meeting.of(membershipId, thirdMeeting),
                Meeting.of(membershipId, fourthMeeting));
    }
}
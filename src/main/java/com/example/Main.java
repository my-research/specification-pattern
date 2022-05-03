package com.example;

import com.example.model.Meeting;
import com.example.model.Period;
import com.example.policy.RefundPolicy;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    private static LocalDateTime NOW = LocalDateTime.now();

    public static void main(String[] args) {

        Factor factor = Factor.of(123L, LocalDateTime.now());

        List<Meeting> meetings = loadMeetingsByMembershipId(123L);
        List<RefundPolicy> policies = convertMeetingToPolicy(meetings);

        Optional<RefundPolicy> first = policies.stream()
                .filter(policy -> policy.getCondition().isSatisfiedBy(factor))
                .findFirst();

        RefundPolicy refundPolicy = first.get();
        System.out.println("refundPolicy = " + refundPolicy);
    }

    public static List<RefundPolicy> convertMeetingToPolicy(List<Meeting> meetings) {
        // logic (100 / 미팅 수) * (미팅 수 - n 번째 모임)
        int meetingCount = meetings.size();

        List<RefundPolicy> policies = new ArrayList<>();

        for (int i = 0; i < meetingCount; i++) {
            int refundRate = (100 / meetingCount) * (meetingCount - i);
            Meeting meeting = meetings.get(i);
            policies.add(RefundPolicy.of(meeting.toCondition(), refundRate));
        }
        return policies;
    }

    public static List<Meeting> loadMeetingsByMembershipId(Long membershipId) {
        Period firstMeeting = Period.of(NOW.minusDays(14), NOW.minusDays(7));
        Period secondMeeting = Period.of(NOW.plusDays(17), NOW.plusDays(24));
        return List.of(Meeting.of(membershipId, firstMeeting, 1), Meeting.of(membershipId, secondMeeting, 2));
    }
}

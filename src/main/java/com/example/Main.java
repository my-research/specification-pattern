package com.example;

import com.example.conditions.Specification;
import com.example.model.Meeting;
import com.example.model.Period;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    private static LocalDateTime NOW = LocalDateTime.now();

    public static void main(String[] args) {

        Factor factor = Factor.of(123L, LocalDateTime.now());

        List<Meeting> meetings = loadMeetingsByMembershipId(123L);
        List<Specification> conditions = convertToCondition(meetings);

        for (Specification condition : conditions) {
            condition.isSatisfiedBy(factor);
        }

        Optional<Specification> first = conditions.stream().filter(condition -> condition.isSatisfiedBy(factor))
                .findFirst();
    }

    private static List<Specification> convertToCondition(List<Meeting> meetings) {
        List<Specification> conditions = new ArrayList<>();
        for (int i = 0; i < meetings.size(); i++) {
            Meeting meeting = meetings.get(i);
            Specification condition = meeting.toCondition();
            conditions.add(condition);
        }
        return conditions;
    }

    private static List<Meeting> loadMeetingsByMembershipId(Long membershipId) {
        Period firstMeeting = Period.of(NOW.minusDays(14), NOW.minusDays(7));
        Period secondMeeting = Period.of(NOW.plusDays(7), NOW.plusDays(14));
        return List.of(Meeting.of(membershipId, firstMeeting, 1), Meeting.of(membershipId, secondMeeting, 2));
    }
}

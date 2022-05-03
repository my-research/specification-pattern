package com.example;

import com.example.conditions.Specification;
import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Value;

public class Abc {


    public static void main(String[] args) {

        Long membershipId = null;
        List<Specification> conditions = loadConditions(membershipId);
    }

    @Value
    public static class Meeting {
        LocalDateTime begin;
        LocalDateTime end;
        int order;

        Specification toSpec(int size) {

            return new Specification() {
                int index = order;
                @Override
                public boolean isSatisfiedBy(Factor factor) {
                    int order = Meeting.this.order;
                    int n = size - order;
                    double xx = 100/ size;

                    Duration between = Duration.between(begin.minusDays(7), begin);
                    LocalDateTime now = factor.getNow();
                    return false;
                }
            };
        }
    }
//N = 4
// 4 25  (100 / N) * (N-Order)
// 3 50  (100 / N) * 2
// 2 75  (100 / N) * 3
// 1 100 100


//N = 3
// 3 33
// 2 66
// 1 100


//N = 5
// 5 20
// 4 40
// 3 60
// 2 80
// 1 100

    private static List<Specification> loadConditions(Long membershipId) {

        List<Meeting> meetings = loadClubMeetings(membershipId);

        List<Specification> meetingPeriodCondition = convertToCondition(meetings);

        LocalDateTime refundedAt = LocalDateTime.now().minusDays(10);
        double fee = 1D;

        Factor factor = Factor.of(1L, refundedAt);
        for (int i = 0; i < meetingPeriodCondition.size(); i++) {
            if (meetingPeriodCondition.get(i).isSatisfiedBy(factor)){
                // (100 / N) * (N-Order)
                int a = 100 / meetings.size();
                fee = a * (meetings.size() - i);
            }
        }
        return null;
    }

    private static List<Specification> convertToCondition(List<Meeting> meetings) {

        int size = meetings.size(); // N

        return meetings.stream().map(m -> m.toSpec(size)).collect(Collectors.toList());
    }

    private static List<Meeting> loadClubMeetings(Long membershipId) {
        return null;
    }
}

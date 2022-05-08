package com.example.domain;

import com.example.condition.StudentCondition;
import com.example.condition.TeacherCondition;
import com.example.policy.IdGenerationPolicy;
import com.example.policy.Policy;
import java.util.ArrayList;
import java.util.List;

public class IdGenerator {

    List<Policy<Factor, Identity>> policyContainer = new ArrayList<>();

    public IdGenerator() {
        StudentCondition studentCondition = new StudentCondition();
        TeacherCondition teacherCondition = new TeacherCondition();

        policyContainer.add(
                IdGenerationPolicy.of(studentCondition,
                        (factor) -> Identity.of("1", factor.getName()))
        );

        policyContainer.add(
                IdGenerationPolicy.of(teacherCondition,
                        (factor) -> Identity.of("2", factor.getName()))
        );
    }

    public Identity generateBy(Factor factor) {
        for (Policy<Factor, Identity> policy : policyContainer) {
            boolean satisfiedBy = policy.isSatisfiedBy(factor);
            if (satisfiedBy) {
                return policy.resultBy(factor);
            }
        }
        throw new IllegalStateException("조건에 만족하지 않습니다");
    }
}

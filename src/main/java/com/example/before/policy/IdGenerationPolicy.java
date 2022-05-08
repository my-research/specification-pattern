package com.example.before.policy;

import com.example.before.condition.Condition;
import com.example.before.domain.Factor;
import com.example.before.domain.Identity;
import java.util.function.Function;
import lombok.ToString;
import lombok.Value;

@Value(staticConstructor = "of")
@ToString
public class IdGenerationPolicy implements Policy<Factor, Identity>{

    Condition condition;
    Function<Factor, Identity> what;

    @Override
    public boolean isSatisfiedBy(Factor factor) {
        return condition.isSatisfiedBy(factor);
    }

    @Override
    public Function<Factor, Identity> what() {
        return what;
    }
}

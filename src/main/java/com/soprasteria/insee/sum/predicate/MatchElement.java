package com.soprasteria.insee.sum.predicate;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class MatchElement implements Predicate<Integer> {
    private final Integer sum;
    private final Set<Integer> cachedData = new HashSet<>();
    public MatchElement(Integer sum) {
        this.sum = sum;
    }

    @Override
    public boolean test(Integer element) {
        if (cachedData.contains(sum - element)) {
            return true;
        }
        cachedData.add(element);
        return false;
    }
}

package com.soprasteria.insee.sum.service;

import com.soprasteria.insee.sum.predicate.MatchElement;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class ArrayUtils {
    public static boolean containsSum(Integer[] data, int sum) {
        return Arrays.stream(data).anyMatch(new MatchElement(sum));
    }
}

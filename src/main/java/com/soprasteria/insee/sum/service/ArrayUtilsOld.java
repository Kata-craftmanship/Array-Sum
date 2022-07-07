package com.soprasteria.insee.sum.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class ArrayUtilsOld {

    // Boucles imbriquées :( !!!
    public static boolean containsSum1(Integer[] data, int sum) {
        int max = data.length;
        for (int i = 0; i < max; i += 1) {
            int v1 = data[i];
            for (int j = i + 1; j < max; j += 1) {
                int v2 = data[j];
                if (v1 + v2 == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsSum2(Integer[] data, int sum) {
        int max = data.length;
        for (int i = 0; i < max; i += 1) {
            int currentValue = data[i];
            for (int j = i + 1; j < max; j += 1) {
                int targetValue = data[j];
                if (targetValue == sum - currentValue) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsSum3(Integer[] data, int sum) {
        int max = data.length;
        Set<Integer> cachedData = new HashSet<>();
        for (int i = 0; i < max; i += 1) {
            int currentValue = data[i];
            if (cachedData.contains(sum - currentValue)) {
                return true;
            }
            cachedData.add(currentValue);
        }
        return false;
    }

    public static boolean containsSum4(Integer[] data, int sum) {
        Set<Integer> cachedData = new HashSet<>();
        for (int currentValue : data) {
            if (cachedData.contains(sum - currentValue)) {
                return true;
            }
            cachedData.add(currentValue);
        }
        return false;
    }

    public static boolean containsSum5(Integer[] data, int sum) {
        Set<Integer> cachedData = new HashSet<>();
        return Arrays.stream(data).anyMatch(element -> found(sum, cachedData, element));
    }

    public static boolean containsSum(Integer[] data, int sum) {
        return Arrays.stream(data).anyMatch(foundPredicate(sum));
    }

    private static Predicate<Integer> foundPredicate(int sum) {
        Set<Integer> cachedData = new HashSet<>();
        return element -> found(sum, cachedData, element);
    }

    private static boolean found(int sum, Set<Integer> cachedData, Integer element) {
        if (cachedData.contains(sum - element)) {
            return true;
        }
        cachedData.add(element);
        return false;
    }

}

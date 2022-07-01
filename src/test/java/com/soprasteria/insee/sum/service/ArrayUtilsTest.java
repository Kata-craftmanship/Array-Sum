package com.soprasteria.insee.sum.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayUtilsTest {

   @ParameterizedTest
   @MethodSource("shouldTestSumData")
   public void shouldTestSum(Integer[] data, int sum, boolean expected) {
      assertThat(ArrayUtils.containsSum(data, sum)).isEqualTo(expected);
   }

   private static Stream<Arguments> shouldTestSumData() {
      return Stream.of(
         Arguments.of(new Integer[] { 1, 3, 4, -4 }, 8, false), // First use case
         Arguments.of(new Integer[] { 1, 3, 4, -4 }, 0, true) // second use case
      );
   }
}

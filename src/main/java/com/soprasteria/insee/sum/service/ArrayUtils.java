package com.soprasteria.insee.sum.service;

public class ArrayUtils {

   // Boucles imbriquées :( !!!
   public static boolean containsSum(Integer[] data, int sum) {
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
}

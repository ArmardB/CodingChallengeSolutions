package com.armardbellamy.main;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;

/**
 * Created by armardbellamy on 11/14/16.
 */
public class SortInAscendingOrder {

    public static void main(String[] args) {

        int[] numbers = new int[] {1, 1, 2, 2, 3, 5, 5};
        sortByAsc(numbers);
    }

    public static void sortByAsc(int[] nums){

        Map<Integer, Integer> numsMap = new TreeMap<>();

        int len = nums.length;

        for(int i = 0; i < len; i++){
            if(numsMap.containsKey(nums[i])){
                numsMap.put(nums[i], numsMap.get(nums[i]) + 1);
            } else if (!numsMap.containsKey(nums[i])){
                numsMap.put(nums[i], 1);
            }
        }

        int max = Collections.max(numsMap.values());

        for(int i = 1; i <= max; i++) {
            for (Map.Entry<Integer, Integer> ent : numsMap.entrySet()) {
                if (ent.getValue() == i) {
                    for (int j = 1; j <= i; j++) {
                        System.out.println(ent.getKey());
                    }

                }
            }
        }
    }
}

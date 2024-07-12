package com.example.search.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6}; // k = 4 o/p = 4

//        int[] nums = {3,2,1,5,6,4}; // k = 2 o/p = 5
                int k = 4;
        Set<Integer> dp = new HashSet<>();
        for(int i = 0 ; i<nums.length;i++){
            dp.add(nums[i]);
        }

        int[] arr = new int[dp.size()];
        int i = 0;
        Iterator<Integer> namesIterator = dp.iterator();
        while(namesIterator.hasNext()) {
            arr[i] = namesIterator.next();
            i++;
        }
        Arrays.sort(arr);

        System.out.println(arr[(dp.size()-1)-(k-1)]);
    }
}

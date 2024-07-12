package com.example.search.leetcode;

import java.util.Arrays;

public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        System.out.println(minSubArrayLen(11,arr));
    }

    public static int minSubArrayLen(int target, int[] nums) {

        int res = 0;
        int []subarrayLenght = new int[nums.length-1];
        int a = 0;
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i] >= target){
                return 1;
            }
            res = nums[i];
            for(int j = i+1 ; j < nums.length;j++){
                res+=nums[j];
                if(res >= target){
                    subarrayLenght[a]=j-i+1;
                    break;
                }
            }
            a++;
        }
        Arrays.sort(subarrayLenght);
       for(int i = 0 ; i<subarrayLenght.length-1;i++){
           if(subarrayLenght[i]>0 && subarrayLenght[i+1]>0 ){
               return 0;
           }
       }
        return subarrayLenght[0];
    }
}

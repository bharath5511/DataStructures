package com.example.search.leetcode;

//Given an array of unsorted integers and a value K. Find the minimum length of
//        the subarray whose sum of elements is greater than or equal to K.
//
//        Example:-
//        Input :- arr = [1 2 3 5 8], K = 10
//        Output :- 2. length of subarray [5 8] whose sum is 13
public class MinimumLengthOfSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,30,5};
        int target = 10;
        int n = arr.length;


        int minLen = n;
        for(int i=0 ; i<n-1 ; i++){
                int temp = arr[i];
                int len = n;
            for(int j = i+1 ; j<n ; j++){
                if(temp >= target){
                    len = j-i;
                    break;
                }
                temp+=arr[j];
            }
            minLen = Math.min(len,minLen);
            }
        System.out.println(minLen);
    }
}

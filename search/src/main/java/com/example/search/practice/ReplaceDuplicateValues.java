package com.example.search.practice;

import java.util.*;

public class ReplaceDuplicateValues {

    public static void main(String[] args) {
        // replace duplicate values with 1
        int[] arr = {12,3,5,3,12,5,6,8,9,1,1};

        Set<Integer> duplicates = new HashSet<>();

        for(int i=0 ; i< arr.length ;i++){
            for(int j=i+1 ; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    duplicates.add(arr[i]);
                }
            }
        }

        System.out.println(duplicates);

        for(int i = 0 ; i< arr.length;i++){
            if(duplicates.contains(arr[i])){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

package com.example.search.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,7,8,3,10,9,5};
        int n = arr.length;
        int temp = 0;

        for(int i = 0 ;i<n;i++){
            for(int j = 0 ; j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        Arrays.stream(arr).forEach(System.out::print);
    }
}

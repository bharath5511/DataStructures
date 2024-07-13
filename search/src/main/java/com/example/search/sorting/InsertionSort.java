package com.example.search.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,6,7,8};

        for(int i = 1 ; i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
           while(j>=0 && arr[j] > key){
               arr[j+1] = arr[j];
               j--;
               Arrays.stream(arr).forEach(System.out::print);
           }
            System.out.println();
           arr[j+1] = key;
        }
    }
}

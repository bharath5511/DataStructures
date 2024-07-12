package com.example.search.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        selectionSortWithMinNumber_start();
        System.out.println();
        selectionSortWithMaxNumber_start();
    }
    public static void selectionSortWithMaxNumber_start(){
        int[] arr = {6,4,1,7,5,3};
        int maxIndex= -1;

        for(int i = arr.length-1; i>=0 ; i--){
            maxIndex = i;
            for(int j = 0 ; j<=i ; j++){
                if(arr[j] > arr [maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static void selectionSortWithMinNumber_start(){
        int[] arr = {6,4,1,7,5,3};
        int minIndex= -1;

        for(int i = 0; i<arr.length-1; i++){
            minIndex = i;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[j] < arr [minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        Arrays.stream(arr).forEach(System.out::print);
    }
}

package com.example.search.searching;

import java.lang.reflect.Array;

public class LinearSearch {

    public LinearSearch() {
    }

    public int linearSearch(int[] array, int target){

        for(int i = 0; i<array.length;i++){
            if(array[i] == target)
                return i;
        }
        return -1;
    }
}

package com.example.search.practice;

// Given a m x n grid filled with non-negative numbers,
// find a path from top left to bottom right, which minimizes
// the sum of all numbers along its path. Note: You can only move
// either down or right at any point in time.
// Input: grid = [[1,3,1],[1,5,1],[4,2,1]] Output: 7
// Input: grid = [[1,2,3],[4,5,6]] Output: 12 Question link:
public class Gs {
    public static void main(String[] args) {
       int[][] arr = { {1,3,1},{1,5,1},{4,2,1}};
//       int[][] arr = { {1,2,3},{4,5,6}};
        int firstRow=0;
        for(int i = 0 ; i < 1;i++){
            for(int j = 0 ; j< arr[0].length;j++){
                firstRow+=arr[i][j];
            }
        }

        int firstrow_lastColum=firstRow;
        for(int i = arr[0].length-1 ; i >= arr[0].length-1;i--){
            for(int j =1  ; j< arr.length;j++){
                firstrow_lastColum+=arr[j][i];
            }
        }
        System.out.println("firstrow_lastColum "+firstrow_lastColum);

        int firstColumn=0;
        for(int i = 0 ; i < 1;i++){
            for(int j = 0 ; j< arr.length;j++){
                firstColumn+=arr[j][i];
            }
        }

        int firstColumn_lastRow=firstColumn;
        for(int i = arr.length-1 ; i >= arr.length-1;i--){
            for(int j = 1 ; j< arr[0].length;j++){
                firstColumn_lastRow+=arr[i][j];
            }
        }
        System.out.println("firstColumn_lastRow "+firstColumn_lastRow);

        System.out.println("min : "+Math.min(firstColumn_lastRow,firstrow_lastColum));

    }
}

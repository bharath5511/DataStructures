package com.example.search.practice;

public class MatrixMultiplication {
    public static void main(String[] args) {

        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};

        int c[][] = new int[3][3];

        for(int i = 0 ;i< a.length ; i++){
            for(int j = 0 ;j< b.length ; j++){

                c[i][j] = c[i][j] + a[i][j] * b[j][i];

            }
        }

        for(int i = 0 ;i< a.length ; i++){
            for(int j = 0 ;j< b[0].length ; j++){

                System.out.print(c[i][j]);
            }
            System.out.println("");
        }
    }
}

package com.example.search.pattern;
/*
   1
  121
 12321
1234321
*/

public class Pattern {
    public static void main(String[] args) {

        /*
         *
         * *
         * * *
         * * * *
         */
        rightHalfPyramid(4);
        System.out.println("-------------------------------------------------");

        /*
             ___*
             __**
             _***
             ****
         */
        leftHalfPyramid(4);

        pyramid(4);


    }

    private static void pyramid(int n) {


        for (int i = 0; i < n; i++) {
            int a = 1;
            for (int j = 0; j < n + i; j++) {
             if(i + j >= n-1 && j < n){
                 if(i+j>n+i){
                     a--;
                     System.out.print(a);
                 }
                 System.out.print(a);
                 a++;
                }  else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }

    private static void rightHalfPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    private static void leftHalfPyramid(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i + j >= n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println(" ");

        }
    }
}

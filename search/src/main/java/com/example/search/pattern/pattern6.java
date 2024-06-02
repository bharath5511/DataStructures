package com.example.search.pattern;

public class pattern6 {

    /*
         *******
          *****
           ***
            *
     */
    public static void main(String[] args) {

        int n = 13, a = 13;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - 1) + a; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            a--;
            System.out.println();
        }
    }
}

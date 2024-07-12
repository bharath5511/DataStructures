package com.example.search.practice;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value ");
        int n = sc.nextInt();
        int res = 0;
        int first = 0;
        int second = 1;
        if(n>1){
            for(int i = 1 ; i <= n ; i++) {
                if (i == 1) {
                    System.out.print(first);
                } else if (i == 2) {
                    System.out.print(second);
                } else {
                    res = first + second;
                    first = second;
                    second = res;
                    System.out.print(res);
                }
                System.out.print(" ");
            }
        }

    }

}

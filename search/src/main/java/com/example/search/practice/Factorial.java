package com.example.search.practice;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value ");
        int n = sc.nextInt();
        int res = 1;
        for(int i = n ; i >=1;i-- ){
            res = res*i;
        }
        System.out.println(res);
    }
}

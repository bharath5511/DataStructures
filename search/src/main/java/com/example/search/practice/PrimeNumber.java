package com.example.search.practice;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value ");
        int val  = sc.nextInt();
        System.out.print(findPrime(val));
    }

    private static boolean findPrime(int val) {

        if(val <= 1){
            return false;
        }else {
            for (int i = 2; i <=val/2; i++) {
                if (val % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

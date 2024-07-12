package com.example.search.practice;

import java.util.Scanner;

public class PrintPrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value ");
        int n  = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
           if(returnPrimeNumbers(i)){
               System.out.print(i);
               System.out.print(" ");
           }
        }
    }

    private static boolean returnPrimeNumbers(int val) {
        if(val<=1){
            return false;
        }
        for(int i = 2 ; i<val/2; i++){
            if(val%i == 0){
                return false;
            }
        }
        return true;
    }
}

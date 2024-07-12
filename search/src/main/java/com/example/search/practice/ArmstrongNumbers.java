package com.example.search.practice;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value ");
        // Armstrong numbers between 0 to 999 are 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407
        int n = sc.nextInt();

        int inputVal = n;
        int power = String.valueOf(n).length();
        int arr[] = new int[power];
        for(int i = power-1 ; i>=0;i--){
            arr[i] = n%10;
            n = n/10;
        }


        for(int i = 0 ; i<power ; i++){
            int val = arr[i];
            for(int j = 0 ; j<power-1;j++){
                arr[i] *=val;
            }
        }

        int res = 0;
        for(int i = 0 ; i<=power-1 ; i++){
            res += arr[i];
        }

        if(inputVal == res){
            System.out.println(inputVal+" is Armstrong Number");
        }else{
            System.out.println(inputVal+" is Not Armstrong Number");
        }

    }
}

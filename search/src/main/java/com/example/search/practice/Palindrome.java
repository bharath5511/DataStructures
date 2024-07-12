package com.example.search.practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value:");
        int num = sc.nextInt();

        int inputVal = num;

        int res = 0 ;
        while(num!=0){
            res = res*10 + num % 10;
            num = num/10;
        }

        if(inputVal == res){
            System.out.println(inputVal+" is Palindrome");
        }else {
            System.out.println(inputVal + " is Not Palindrome");
        }
    }
}

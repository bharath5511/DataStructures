package com.example.search.practice;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
        public static boolean isPalindrome(int x) {
//            StringBuffer sb2 = new StringBuffer(String.valueOf(x));
//            if(String.valueOf(x).equals(sb2.reverse().toString())){
//                return true;
//            }
//            return false;

            int sum = 0, target = x;

            while (x > 0) {

                int rem = x % 10;
                x = x / 10;

                sum = sum * 10 + rem;
            }
            return sum == target;
        }
}

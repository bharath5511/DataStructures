package com.example.search.leetcode;

//Example:-
//        Input :- aabbbbcde
//        Output :- [2,4]
//
//        Explanation -
//        Longest uniform substring - bbbb
//        Initial Index - 2
//        length of substring - 4
public class LongestUniformSubstring {
    public static void main(String[] args) {
        String s = "aabbbbcdeeeee";
        int n = s.length();

        int index = 0;
        int maxLength = 0;
        for (int i = 0 ; i<n-1;i++){
            int length = 0;
            for(int j = i+1 ; j < n ;j++){
                if(s.charAt(i) == s.charAt(j)){
                    length=j-i+1;
                }else{
                    break;
                }
            }

            if(length > maxLength){
                maxLength = length;
                index = i;
            }

        }

        System.out.println(index +""+maxLength);
    }
}

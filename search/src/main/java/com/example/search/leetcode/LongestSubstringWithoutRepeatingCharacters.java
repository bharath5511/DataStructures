package com.example.search.leetcode;

//Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String s = "aabbbbcdeeeee";
        int n = s.length();
        int[] count = new int[256];

        int index = 0;
        int maxLength = 0;
        for (int i = 0 ; i<n-1;i++){
            int length = 0;
            for(int j = i+1 ; j < n ;j++){
                if(s.charAt(i) != s.charAt(j) && count[s.charAt(j)] == 1){
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

        System.out.println(s.substring(index,maxLength+1));

    }
}

package com.example.search.leetcode;//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//        Each letter in magazine can only be used once in ransomNote.
//
//
//
//        Example 1:
//
//        Input: ransomNote = "a", magazine = "b"
//        Output: false
//        Example 2:
//
//        Input: ransomNote = "aa", magazine = "ab"
//        Output: false
//        Example 3:
//
//        Input: ransomNote = "aa", magazine = "aab"
//        Output: true
//
//
//        Constraints:
//
//        1 <= ransomNote.length, magazine.length <= 105
//        ransomNote and magazine consist of lowercase English letters.

public class Randsome {
    public static void main(String[] args) {
        String ransomNote = "aaa";
        String magazine ="aab";

        System.out.println(getResult(ransomNote,magazine));
    }

    private static boolean getResult(String str1, String str2) {

        int[] charList1 = new int[26];
        for (char c : str1.toCharArray()) {
            charList1[c - 'a'] += 1;
        }

        int[] charList2 = new int[26];
        for (char c : str2.toCharArray()) {
            charList2[c - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if (charList2[i] < charList1[i]) {
                return false;
            }
        }
        return true;
    }

}

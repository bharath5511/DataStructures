package com.example.search.leetcode;

public class FirstNonRepeatedCharacterIndex {
    public static void main(String[] args) {
//        System.out.println(firstUniqChar("aabb"));
        System.out.println(firstUniqChar1("baccd"));
    }
    public static int firstUniqChar(String s) {

        int n = s.length();
        int resIndex = n;
        for (int i = 0; i < n; i++) {
            boolean found = true;
            // Step 2: Check if the character repeats in the
            // rest of the string
            for (int j = 0; j < n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = false;
                    break;
                }
            }
            // Step 3: If character does not repeat, return
            // its index
            if (found) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar1(String s) {
        int[] countList = new int[26];
        char[] sc = s.toCharArray();
        for(char c:sc){
            countList[c-'a'] += 1;
        }
        for(int i=0;i<s.length();i++){
            if(countList[sc[i]-'a']==1)
                return i;
        }
        return -1;
    }
}


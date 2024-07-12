package com.example.search.leetcode;

import java.util.ArrayList;
import java.util.List;

public class StreamsPractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        int mul = list.stream().mapToInt(n -> n*2).sum();
        System.out.println(sum);
        System.out.println(mul);
    }
}

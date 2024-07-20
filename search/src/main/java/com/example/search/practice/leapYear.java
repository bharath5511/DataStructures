//package com.example.search.practice;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//public class leapYear {
//    public static void main(String[] args) {
//
//        List<String> str = new ArrayList<>();
//        str.add("ere");
//        str.add("cdcdcd");
//        str.add("adcdcd");
//        str.add("ddcdcd");
//        str.add("ddcdcd");
//
//        IntStream str1 = Optional.ofNullable(str)
//                .map(String::chars)
//                .orElse("");
//
//        List<String> stringList = str.stream()
//                .filter(s -> s.length()>5).sorted().distinct()
//                .collect(Collectors.toList());
//        System.out.println(stringList);
//
//        List<Integer> num = new ArrayList<>();
//
//        System.out.println(isPrime(4));
//
//
//    }
//    public static boolean isPrime(int number) {
//        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
//    }
//
//    public static boolean isPrime1(int number) {
//        return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0);
//    }
//}

package com.example.search.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("bharath","BTECH");
        stringMap.put("asd","CSE");
        stringMap.put("cdv","BE");
        stringMap.put("tyuf","BTECH");

        Map<String,String> btech = stringMap.entrySet().stream()
                .filter(s -> s.getValue().equals("BTECH"))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));



        System.out.println(btech);


       List<String> btech1 = stringMap.entrySet().stream()
                .filter(s -> s.getValue().equals("BTECH"))
               .map(s -> s.getKey())
                .collect(Collectors.toList());

        System.out.println(btech1);

    }
}

package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
//Find the maximum number that can be create using string array.
//        num={"10","301","2"} => o/p:"301210"
//        num={"1","13","101","2"} o/p: "2131101"
//"103012", 301102,301210 , 231010
public class Dummy {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("10","310","2");
        int[] arr1 = new int[6];
        for(int i = 0 ; i<arr.size();i++){
            String res = arr.get(i);
            for(int j = 0 ; j<arr.size();j++){
                if( i != j) {
                    res += arr.get(j);
                }
            }
            arr1[i] = Integer.parseInt(res);
        }

        int max = 0;
        for(int i = 0 ; i<arr1.length;i++){
           max =  Math.max(max,arr1[i]);
        }

        System.out.println(max);

    }


}

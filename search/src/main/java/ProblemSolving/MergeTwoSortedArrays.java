package ProblemSolving;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 2, 3, 4, 5};

//        List<Integer> integers = Arrays.asList(Arrays.stream(arr).toArray());

        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5),
                                                    Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> integerList = list.stream().flatMap(f -> f.stream()).collect(Collectors.toList());

        Collections.sort(integerList);
        System.out.println(integerList);
    }
}

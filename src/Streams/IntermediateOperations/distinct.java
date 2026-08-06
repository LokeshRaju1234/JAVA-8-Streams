package Streams.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class distinct {
    public static void main(String [] args) {

        Integer[] arr = {1, 5, 2, 7, 4, 4, 2, 0, 9};

        //dictinct is used to remove the duplicate values and keep only unique values
        Stream<Integer> result = Arrays.stream(arr).distinct();

        List<Integer> res = result.collect(Collectors.toList());
        System.out.println(res);
    }

}

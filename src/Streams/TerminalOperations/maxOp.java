package Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class maxOp {
    public static void main(String[] args) {
        //finds the minimum element from the stream based on comparator provided
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        //it takes optional
        Optional<Integer> maxValue = numbers.stream()
                .filter((Integer val) -> val >= 3)
                //Java internally compares elements like:
//        compare(2,1)
//        compare(1,4)
//        compare(1,7)
//        compare(1,10)
                .max(Integer::compareTo);
        //min((Integer val1,Integer val2) -> val1 - val2)
        System.out.println(maxValue.get());

        //another approach
        Optional<Integer> maxValue1 = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .max((val1,val2) -> val1 - val2);
        System.out.println(maxValue1.get());
    }
}

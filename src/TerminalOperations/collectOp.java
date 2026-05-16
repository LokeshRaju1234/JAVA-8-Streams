package TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class collectOp {
    public static void main(String[] args) {
        //can be used to collect the elements of the stream into an list,set..etc
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        List<Integer> filteredNumber = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .collect(Collectors.toList());

       filteredNumber.stream()
                .forEach((Integer val) -> System.out.println(val));
    }
}

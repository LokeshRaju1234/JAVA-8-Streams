package TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {
        //checks if any value in the stream match the given predicate
        //and return the boolean

        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        boolean hasValue = numbers.stream()
                .anyMatch((Integer val) -> val == 3);

        System.out.println(hasValue);
    }
}

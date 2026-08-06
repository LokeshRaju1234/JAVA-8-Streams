package Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class countOp
{
    public static void main(String[] args) {
        //returns the count of elements present in the stream
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        Long countNum = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .count();

        System.out.println(countNum);
    }
}

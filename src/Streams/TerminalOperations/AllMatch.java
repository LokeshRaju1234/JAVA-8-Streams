package Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class AllMatch
{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        //checks if all values in the stream is greater than given number or not
        boolean hasValue = numbers.stream()
                        .allMatch((Integer val) -> val > 0);

        System.out.println(hasValue);
    }
}

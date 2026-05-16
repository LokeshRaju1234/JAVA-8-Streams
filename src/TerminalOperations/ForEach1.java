package TerminalOperations;

import java.util.*;

public class ForEach1 {
    public static void main(String [] args)
    {
        //to perform action on each element of the stream
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        numbers.stream()
                .filter((Integer val) -> val >= 3)
                .forEach((Integer val) -> System.out.println(val));
    }
}

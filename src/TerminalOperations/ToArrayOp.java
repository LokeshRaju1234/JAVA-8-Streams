package TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class ToArrayOp {

    public static void main(String [] args)
    {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        Object [] filteredNumbers = numbers.stream()
                .filter((Integer val) -> val >= 3)
                //to convert into array it needs it needs the size to create
                //array and it will internally calculates the size of the array
                .toArray((int size) -> new Integer[size]);

        System.out.println(Arrays.toString(filteredNumbers));
    }
}

package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class mapToInt {
    public static void main(String [] args)
    {
        //helps to work with primitive "int" data types
        //to convert into int data types

        List<String> numbers = Arrays.asList("1","2","3","4","5");

        IntStream numberStream = numbers.stream()
                .mapToInt((String val) -> Integer.parseInt(val));

        int [] numberArray = numberStream.toArray();

        for(int ele : numberArray)
        {
            System.out.println(ele);
        }
    }
}

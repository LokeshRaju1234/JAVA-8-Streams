package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class mapToLong {


    public static void main(String [] args)
    {
        //helps to work with primitive "int" data types
        //to convert into int data types

        List<String> numbers = Arrays.asList("10000000000","200000000000","1000000000010","40000","5");

        LongStream numberStream = numbers.stream()
                .mapToLong((String val) -> Long.parseLong(val));

         long [] numberArray = numberStream.toArray();

        for(long ele : numberArray)
        {
            System.out.println(ele);
        }
    }

}

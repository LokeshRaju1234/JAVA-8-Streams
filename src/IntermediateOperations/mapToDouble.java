package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class mapToDouble
{

    public static void main(String [] args)
    {
        //helps to work with primitive "double" data types
        //to convert into double data types

        List<String> numbers = Arrays.asList("1.222","2.555","3.777","4.888","5.7466");

        DoubleStream numberStream = numbers.stream()
                .mapToDouble((String val) -> Double.parseDouble(val));

        double [] numberArray = numberStream.toArray();

        for(double ele : numberArray)
        {
            System.out.println(ele);
        }
    }
}

package Streams.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Peek {
    public static void main(String [] args) {

        //peek will helps you to see the intermediate result of the stream
        //which is getting processed
       List<Integer> numbers = Arrays.asList(1,2,3,4,5);
       Stream<Integer> numberstream = numbers.stream()
               .filter((Integer val) -> val > 2)
               .peek((Integer val) -> System.out.println(val))
               .map((Integer val) -> -2 * val);

        List<Integer> res = numberstream.collect(Collectors.toList());
        System.out.println(res);
    }
}

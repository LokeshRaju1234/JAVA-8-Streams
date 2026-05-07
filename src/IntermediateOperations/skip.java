package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class skip {
    public static void main(String [] args) {

        //skip will skips the first n elements of the stream
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        //skips the n elements
        Stream<Integer> numberstream = numbers.stream().skip(3);

        List<Integer> res = numberstream.collect(Collectors.toList());
        System.out.println(res);

    }
}

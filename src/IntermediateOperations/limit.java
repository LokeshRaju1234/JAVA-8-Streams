package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class limit {
    public static void main(String [] args) {

        //truncate the stream,to have no longer than given maxsize
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        //only allow the max elements
        Stream<Integer> numberstream = numbers.stream().limit(3);

        List<Integer> res = numberstream.collect(Collectors.toList());
        System.out.println(res);
    }
}

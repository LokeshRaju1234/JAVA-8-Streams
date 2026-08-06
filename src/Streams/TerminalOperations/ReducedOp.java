package Streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducedOp {
    public static void main(String[] args) {
        //does resuction on the elements of the stream.
        //perform associative aggregation function
        //it takes optional and optional is used to avoid null pointer exception
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        Optional<Integer> reducedvalue = numbers.stream()
                .reduce((Integer val1,Integer val2) ->val1 + val2);

        //it provides more methods
        System.out.println(reducedvalue.get());
    }
}

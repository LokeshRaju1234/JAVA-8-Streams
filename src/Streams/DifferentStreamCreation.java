package Streams;

import java.util.*;
import java.util.stream.Stream;

public class DifferentStreamCreation
{
    public static void main(String[] args)
    {
        ///From collection
        List<Integer> salaryList = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> streamFromIntegerList = salaryList.stream();

        //from Array
        Integer [] salaryArray = {1,2,3,4,5,6};
        Stream<Integer> streamFromArray = Arrays.stream(salaryArray);

        //from static method
        Stream<Integer> streamFromStaticMethod = Stream.of(1,2,3,4,5);

        //from stream Builder
        Stream.Builder<Integer> streambuilder = Stream.builder();
        streambuilder.add(1).add(2).add(3);

        //from stream iterate
        //iterate -->will keep on iterating
        //we need to give the starting value
        Stream<Integer> streamFromIterate =
                Stream.iterate(1000,(Integer n) -> n + 5000).limit(5);
    }
}

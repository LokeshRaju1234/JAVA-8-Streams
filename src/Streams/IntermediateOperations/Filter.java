package Streams.IntermediateOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter
{
    public static void main(String[] args)
    {
        Stream<String> nameStream = Stream.of("Hello","EVERY","BODY");
        Stream<String> filteredStream = nameStream.filter((String name) ->
                name.length() <= 4);
        List<String> result = filteredStream.collect(Collectors.toList());
        System.out.println(result);
    }
}

package IntermediateOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map
{
    public static void main(String[] args)
    {
        //map is used to transfrom each element
        Stream<String> nameStream = Stream.of("Hello","EVERY","BODY");
        Stream<String> transformedResult = nameStream.map((String name) ->
                name.toLowerCase());
        List<String> result = transformedResult.collect(Collectors.toList());
        System.out.println(result);
    }
}

package IntermediateOperations;

import javax.print.DocFlavor;
import java.util.*;
import java.util.stream.*;

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

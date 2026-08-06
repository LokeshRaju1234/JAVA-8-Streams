package Streams.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatmap {
    public static void main(String[] args)
    {
        //used to iterate over each element of the complex collection and helps to flatten
        //into single line
        List<List<String>> sentenceList = Arrays.asList(Arrays.asList("I","LOVE","YOU"),
                Arrays.asList("Your","Concepts","ARE","Clear"),
                Arrays.asList("ITS","VERY","EASY"));

        Stream<String>  wordstream = sentenceList.stream()
                .flatMap((List<String> sentence) -> sentence.stream());
        List<String> res = wordstream.collect(Collectors.toList());
        System.out.println(res);

        //you can also use map with flatmap in order to transfrom the value
        Stream<String>  wordstream1 = sentenceList.stream()
                .flatMap((List<String> sentence) -> sentence.stream()
                        .map((String name) -> name.toLowerCase()));

        List<String> res1 = wordstream1.collect(Collectors.toList());
        System.out.println(res1);
    }
}

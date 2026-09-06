import java.util.*;
import java.util.stream.Collectors;

public class partitionBy
{
    public static void main(String[] args) {
        //write a program to partition the list of elements by taking the set of even and odd elements
        //partition by returns a boolean value if even it returns true
        //first it will divide the data into two parts based on the condition
    List<Integer> li = Arrays.asList(10,11,12,16,19,18,26,28,31);
    Map<Boolean,List<Integer>> res = li.stream().collect(Collectors.partitioningBy((n)-> n%2 == 0));
    System.out.println(res);

    Map<String,List<Integer>> res1 = li.stream().collect(Collectors.groupingBy(n-> n % 2 == 0 ? "EVEN" : "ODD"));
        System.out.println(res1);
    }
}

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>(Arrays.asList("lPU","vIT","aBC","bAC"));

        //sorted in ascending order
        List<String> out = li.stream().sorted().collect(Collectors.toList());
        System.out.println(out);

        //sorted in reverse order
        List<String> out1 = li.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(out1);

        //maptoInt
        ArrayList<Integer> li1 = new ArrayList<>(Arrays.asList(1,2,3,6,55,788,100));
        OptionalInt val = li1.stream().filter(n -> n > 788).mapToInt((n) -> n).max();
        System.out.println(val);

        //use orelse whenever you are using min or max
       int  val3 = li1.stream().filter((n) -> n > 50).mapToInt((n) -> n).max().orElse(0);
        System.out.println(val3);

        //find the minimum number
        int minval = li1.stream().mapToInt((n) -> n).min().orElse(0);
        System.out.println(minval);

        //find the average of all the elements
        double avg = li1.stream().mapToInt((n)->n).average().orElse(0);
        System.out.println(avg);

        //write a program to add all the elements of the list
        //does reduction on the elements of the stream
        int sum = li1.stream().reduce(0,(a,b)-> a + b);
        System.out.println("sum is : " + sum);

        int mul = li1.stream().reduce(1,(a,b)-> a * b);
        System.out.println("multiplication of numbers: " + mul);

        int large = li1.stream().reduce(Integer.MIN_VALUE,(a,b) -> a > b ? a : b);
        System.out.println("Large value using reduce: " + large);

        //write a prog to concatenate all the elements present in the list by using reduce
        String s = li.stream().reduce("",(a,b)-> a + b);
        System.out.println("Concatenated string: " + s);

        //write a program to find the first element in a list
        int firstele = li1.stream().mapToInt((n)-> n).findFirst().orElse(0);
        System.out.println("First element in the list: " + firstele);

        //find out the first name which starts with A
        String name = li.stream().filter((a) -> a.startsWith("A")).findFirst().orElse("");
        System.out.println("First name starting with A: " + name);

        int findany = li1.stream().mapToInt((n)-> n).findAny().orElse(0);
        System.out.println("First element in the list: " + findany);

        //write a program to conv everyname to uppercase
        li.stream().map((n) -> n.toUpperCase()).forEach(System.out::println);
        System.out.println("First character is converted into upper case");
        li.stream().map((n)-> Character.toUpperCase(n.charAt(0)) + n.substring(1)).forEach(System.out::println);

        //write a program to find the second largest element from an list
        List<Integer> res1 = li1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(res1);
        //write a program to print the first 3 elements
        //use limit(3)
        li1.stream().limit(3).forEach(System.out::println);


    }
}
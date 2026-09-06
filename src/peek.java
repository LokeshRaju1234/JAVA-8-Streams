import java.util.Arrays;
import java.util.List;

public class peek {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(11,10,20,30,40,50,60);
        li.stream().filter((n)-> n%2 == 0).peek(n-> System.out.println("After peek " + n)).filter(n-> n >= 30).forEach((n)-> System.out.println(n));
    }
}

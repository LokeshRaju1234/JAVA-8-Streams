import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student
{
    String name;
    String dept;

    public Student(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class Groupby
{
    public static void main(String[] args) {
        ArrayList<Student> li = new ArrayList<>();
        li.add(new Student("Lokesh","CSE"));
        li.add(new Student("Raghu","ECE"));
        li.add(new Student("sur","CSE"));
        li.add(new Student("XYZ","ECE"));
        li.add(new Student("ramu","MEC"));
        //whenever you are printing li as it is student object it will not print bcz
        //it calls toString() method of the class so if we want to print we need to define
        //the toString() method
        System.out.println(li);

        //to print department wise students we use groupBy
        Map<String, List<Student>>  res = li.stream().collect(Collectors.groupingBy(n->n.dept));
        System.out.println(res);

        //write a program to partition the list of elements by taking the set of even and odd elements
        //partition by returns a boolean value
    }
}

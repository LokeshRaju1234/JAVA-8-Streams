package GUI.ExamPractice;

import java.util.*;

public class Employee_1 {
    int empid;
    String name;
    String department;
    double salary;
    double performanceRating;

    public Employee_1(int empid, String name, String department, double salary, double performanceRating) {
        this.empid = empid;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.performanceRating = performanceRating;
    }

    @Override
    public String toString() {
        return "empid=" + empid +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", performanceRating=" + performanceRating;
    }
}

class main{
    public static void main(String[] args) {
        ArrayList<Employee_1> li = new ArrayList<>();
        //Create at least 10 Employee objects and store them in an ArrayList.
        li.add(new Employee_1(101,"Rahul","EEE",50000,4.6));
        li.add(new Employee_1(102,"Loki","CSE",30000,3.0));
        li.add(new Employee_1(103,"Raghu","IT",20000,4.2));
        li.add(new Employee_1(104,"Raju","CSE",25000,4.1));
        li.add(new Employee_1(105,"Kumar","CSE",56000,5.1));
        li.add(new Employee_1(106,"Raj","MEC",70000,2.8));
        li.add(new Employee_1(107,"suri","MEC",80000,3.3));
        li.add(new Employee_1(108,"siva","CSE",90000,2.2));
        li.add(new Employee_1(109,"pranith","CSE",75000,4.5));
        li.add(new Employee_1(110,"stev","ECE",85000,3.6));

//        Using Stream API and lambda expressions, perform the following:
//
//        Display employees whose performance rating is 4.0 or above.
        li.stream().filter((n)-> n.performanceRating >= 4.0).forEach(System.out::println);
        System.out.println();
        //Display employees belonging to the "CSE" department.
        System.out.println("Display employees belonging to the \"CSE\" department.");
        li.stream().filter((n)-> n.department == "CSE").forEach(System.out::println);

        System.out.println();
        System.out.println("Extract only the employee names using map().");
        li.stream().map((n)-> n.name).forEach(System.out::println);

        System.out.println();
        System.out.println("Sort employees according to their salary in descending order.");
        li.stream().sorted((a,b)-> Double.compare(b.salary,a.salary)).forEach(System.out::println);

        System.out.println();
        System.out.println("Find the employee with the highest performance rating.");
        Employee_1 e = li.stream().max((a,b)-> Double.compare(a.performanceRating,b.performanceRating)).orElse(null);
        System.out.println(e);
    }
}

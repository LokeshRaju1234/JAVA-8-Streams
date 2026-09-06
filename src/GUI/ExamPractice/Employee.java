package GUI.ExamPractice;


import java.util.*;
import java.util.stream.Collectors;

//UNIT I — Collections, Streams and Lambda Operations
//Practice Question 1 — Employee Performance Analysis
//
//Create a Java program to manage employee performance.
//
//Define a class Employee containing:
//
//int empId;
//String name;
//String department;
//double salary;
//double performanceRating;
//
//Create at least 10 Employee objects and store them in an ArrayList.
//
//Using Stream API and lambda expressions, perform the following:
//
//Display employees whose performance rating is 4.0 or above.
//Display employees belonging to the "CSE" department.
//Extract only the employee names using map().
//Sort employees according to their salary in descending order.
//Find the employee with the highest performance rating.
//Calculate the average salary of all employees.
//Store the names of employees having a salary greater than ₹50,000 into a new List.
//
//        Restriction: Do not use traditional loops for processing the collection.
public class Employee {

        int empId;
        String name;
        String department;
        double salary;
        double performanceRating;

    public Employee(int empId, String name, String department, double salary, double performanceRating) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.performanceRating = performanceRating;
    }
    //You are overriding the default toString() to provide your own meaningful representation.
    @Override
    public String toString() {

        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", performanceRating=" + performanceRating +
                '}';
    }
}

class EmployeePerformance{
    public static void main(String[] args) {
        ArrayList<Employee> li = new ArrayList<>();
        //Create at least 10 Employee objects and store them in an ArrayList.
        li.add(new Employee(101,"Rahul","EEE",50000,4.6));
        li.add(new Employee(102,"Loki","CSE",30000,3.0));
        li.add(new Employee(103,"Raghu","IT",20000,4.2));
        li.add(new Employee(104,"Raju","CSE",25000,4.1));
        li.add(new Employee(105,"Kumar","CSE",56000,5.1));
        li.add(new Employee(106,"Raj","MEC",70000,2.8));
        li.add(new Employee(107,"suri","MEC",80000,3.3));
        li.add(new Employee(108,"siva","CSE",90000,2.2));
        li.add(new Employee(109,"pranith","CSE",75000,4.5));
        li.add(new Employee(110,"stev","ECE",85000,3.6));

        //Using Stream API and lambda expressions, perform the following:
        //Display employees whose performance rating is 4.0 or above.

        li.stream().filter((n)->n.performanceRating >= 4.0).forEach(System.out::println);

        System.out.println();
        //Display employees belonging to the "CSE" department.
        System.out.println("Display employees belonging to the \"CSE\" department.");
        li.stream().filter((n)-> n.department.equals("CSE")).forEach((x)->System.out.println(x));

        //Extract only the employee names using map().
        System.out.println();
        System.out.println("Extract only the employee names using map().\n");
        li.stream().map((n)->n.name).forEach(System.out::println);

        //Sort employees according to their salary in descending order.
        System.out.println();
        System.out.println("Sort employees according to their salary in descending order.\n");

        li.stream().sorted((a,b)->Double.compare(b.salary,a.salary)).forEach(System.out::println);

        System.out.println();
        System.out.println("Find the employee with the highest performance rating.\n");

        Employee li2 = li.stream().max((a, b)-> Double.compare(a.performanceRating,b.performanceRating)).orElse(null);
        System.out.println(li2);

        //Calculate the average salary of all the employees
        System.out.println();
        System.out.println("Average salary of all the employees");
        double res = li.stream().mapToDouble((n)-> n.salary).average().orElse(0.0);
        System.out.println(res);

        //Store the names of employees having a salary greater than ₹50,000 into a new List.
        System.out.println();
        System.out.println("Store the names of employees having a salary greater than ₹50,000 into a new List.");
        List<String> highsalary = li.stream().filter((x)-> x.salary > 50000).map((x)-> x.name).collect(Collectors.toList());
        System.out.println(highsalary);
    }
}

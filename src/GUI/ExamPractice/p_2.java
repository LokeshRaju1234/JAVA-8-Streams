package GUI.ExamPractice;

import java.util.*;
import java.util.stream.Collectors;

public class p_2 {
    int orderId;
    String customerName;
    String product;
    double amount;
    String status;

    public p_2(int orderId, String customerName, String product, double amount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.product = product;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", product='" + product + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'';
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<p_2> li = new ArrayList<>();
        li.add(new p_2(101, "Lokesh", "Laptop", 75000, "Delivered"));
        li.add(new p_2(102, "Rahul", "Mobile", 25000, "Shipped"));
        li.add(new p_2(103, "Priya", "Headphones", 3500, "Delivered"));
        li.add(new p_2(104, "Amit", "Keyboard", 2500, "Pending"));
        li.add(new p_2(105, "Sneha", "Monitor", 15000, "Shipped"));
        li.add(new p_2(106, "Vikas", "Mouse", 1200, "Delivered"));
        li.add(new p_2(107, "Anjali", "Tablet", 22000, "Pending"));
        li.add(new p_2(108, "Karan", "Smartwatch", 8000, "Cancelled"));
        li.add(new p_2(109, "Neha", "Printer", 12000, "Delivered"));
        li.add(new p_2(110, "Arjun", "Camera", 45000, "Shipped"));

        System.out.println("Display all orders whose amount is greater than ₹5,000.");
        li.stream().filter((n)-> n.amount > 5000).forEach(System.out::println);

        System.out.println();
        System.out.println("Display only completed orders.");
        li.stream().filter((n)-> n.status.equals("Delivered")).forEach(System.out::println);

        System.out.println();
        System.out.println("Extract customer names using map().");
        li.stream().map((n)-> n.customerName).forEach(System.out::println);

        System.out.println();
        System.out.println("Sort orders according to amount in ascending order.");
        li.stream().sorted((a,b)-> Double.compare(a.amount,b.amount)).forEach(System.out::println);

        System.out.println();
        System.out.println("Calculate the total order amount using reduce().");
        double total = li.stream().mapToDouble((n)-> n.amount).reduce(Double::sum).orElse(0.0);
        System.out.println("Total orders amount is : " + total);

        System.out.println();
        System.out.println("Find the order with the maximum amount using Optional.");
        Optional<p_2> order = li.stream().max((a,b)-> Double.compare(a.amount,b.amount));
        System.out.println(order.get());

        System.out.println();
        System.out.println("Group orders according to their status.");
       Map<String,List<p_2>> res =  li.stream().collect(Collectors.groupingBy((n)-> n.status));
        for(Map.Entry<String,List<p_2>> order1 : res.entrySet()){
            System.out.println(order1);
        }
    }
}

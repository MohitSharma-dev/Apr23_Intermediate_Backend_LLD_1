package Collections;

import java.sql.SQLOutput;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        // List : sequence of elements and usage of index to insert and search
        // ArrayList is not Thread-safe
        List<String> x = new ArrayList<>();
        x.add("Mohit");
        x.add("Abhinav");
        x.add("Rohit");
        x.add("Mayank");
        x.add("Raj");
        // LinkedList is not Thread safe
        // LinkedList : Doubly Linked List
        List<Integer> x1 = new LinkedList<>();
        // LinkedList also implements the behaviours of Deque
        Deque<Integer> d1 = new LinkedList<>();
        // Thread Safe
        List<Integer> x2 = new Vector<>();
        List<Integer> x3 = new Stack<>();

        // Not thread safe
        // No order confirmation
        // constant time operations of add remove and search
        Set<String> s1 = new HashSet<>();
        s1.add("Mohit");
        s1.add("Abhinav");
        s1.add("Rohit");
        s1.add("Mayank");
        s1.add("Raj");
        Set<String> s2 = new LinkedHashSet<>();
        s2.add("Mohit");
        s2.add("Abhinav");
        s2.add("Rohit");
        s2.add("Mayank");
        s2.add("Raj");

        Set<String> s3 = new TreeSet<>();
        s3.add("Mohit");
        s3.add("Abhinav");
        s3.add("Rohit");
        s3.add("Mayank");
        s3.add("Raj");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // EnumSet
        // Enums ?

        Payment payment = new Payment();
        payment.status = PaymentStatus.DE_DUNGA_YAAR;

        Set<PaymentStatus> paymentStatusSet = EnumSet.allOf(PaymentStatus.class);
        System.out.println(paymentStatusSet);

        Queue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        q.add("Mohit");
        q.add("Abhinav");
        q.add("Rohit");
        q.add("Mayank");
        q.add("Raj");

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.poll();
        }

        List<Student> l1 = new ArrayList<>(List.of(
                new Student(2 , "Mohit", 90.0),
                new Student(1 , "Akshay", 10.0),
                new Student(3 , "Yogesh", 20.0)
        ));

        Collections.sort(l1, new StudentPspComparator());
        Collections.sort(l1, new StudentNameComparator());
        for(Student s : l1){
            System.out.print(s.name + " ");
        }
        Collections.sort(x);
        System.out.println(x);

        // By implementing Comparable, we can natural ordering to our classes
        // String : Asc order : natural ordering
    }
}

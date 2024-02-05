package LambdasAndStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<Student> l1 = new ArrayList<>(List.of(
                new Student(2 , "Mohit", 90.0),
                new Student(1 , "Akshay", 10.0),
                new Student(3 , "Yogesh", 20.0)
        ));

        // Method 1
        Collections.sort(l1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });

        // Way 2
        // (x , y) -> {}
        Collections.sort( l1 , (Student x , Student y) -> {
            return x.name.compareTo(y.name);
        } );
        int x = 5;
        Runnable r = () -> {
            System.out.println(x + " Hello World + " + Thread.currentThread().getName());
        };
        System.out.println(r);
        Thread t = new Thread(r);

        Thread t1 = new Thread(() -> {
            System.out.println("Lmbada Experssion");
        });

        Thread t2 = new Thread( () -> System.out.println("hey!"));

        MathematicalOperation Addition = (x1 , y) -> x1 + y;
        MathematicalOperation Subtraction = (x1 , y) -> x1 - y;

        Addition.operate(2 , 3);
        Subtraction.operate(1 , 4);


        // Streams API
        List<Integer> s1 = List.of(5 , 4 , 1 , 3 , 2 , 6);
        Stream<Integer> s = s1.stream();
        Stream<Integer> s2 = s1.stream();
        System.out.println(s);
        System.out.println(s.limit(4).count());; // Limit method will only grab first x elements
        // This will not work
        // Error : stream has already been operated upon or closed
        // Terminal methods closes the stream
//        System.out.println(s.limit(4).count());
        // limit method returns a stream

        // Streams doesn't affect the actual Data source
        System.out.println(s1);


        // Intermediate Methods : returns the stream reference
        // limit
        // Terminal : return the data
        // count

        s2.forEach(System.out::println);

        // filter : Intermediate


        List<Integer> l2 = s1
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(l2);

        // map method : Intermediate

        List<Integer> l3 = s1
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .map((elem) -> elem * elem)
                .sorted((x1 , y) -> { return y - x1;})
                .collect(Collectors.toList());

        System.out.println(l3);

        Optional<Integer> l4 = s1
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .map((elem) -> elem * elem)
                .sorted((x1 , y) -> { return y - x1;})
                .findFirst();

        if(l4.isPresent()){
            Integer x5 = l4.get();
        }

        Integer x6 = s1
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .map((elem) -> elem * elem)
                .sorted((x1 , y) -> { return y - x1;})
                .reduce(0, (curr_sum, elem) -> {
                    return curr_sum + elem;
                });
        System.out.println(x6);
        Integer curr_sum = 0;
        for(int i = 0; i < l3.size(); i ++){
            curr_sum = curr_sum + l3.get(i);
        }

        Integer x7 = s1
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .map((elem) -> elem * elem)
                .sorted((x1 , y) -> { return y - x1;})
                .reduce(Integer.MIN_VALUE, Math::max);

        System.out.println(x7);

                s1
                .parallelStream()
                        .sorted((a , b) -> {
                            System.out.println("Comparing " + a + " and " + b + " in " + Thread.currentThread().getName());
                            return a - b;
                        })
                        .map((elem) -> {
                            System.out.println("Mapping " + elem + " in " + Thread.currentThread().getName());
                            return elem * elem;
                        } )
                .filter((elem) -> {
                    System.out.println("Filtering " + elem + " in " + Thread.currentThread().getName());
                    return elem % 2 == 0;
                })
                .findAny();

                // Intermediate : Lazy
                // Terminal : Eager

        // Concurrent
        // parallelStream
    }
}

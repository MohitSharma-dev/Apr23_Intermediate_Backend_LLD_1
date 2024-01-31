package Generics;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        Pair<Integer, String> p1 = new Pair<>();

        String s = p1.getSecond();
        // Second : S
        // Name, PSP
        // Raw types
        // Before Java 5
        // key : Object, value : Object
        // Backward compatibility
        HashMap hm = new HashMap();
        hm.put("Mohit", 50.0);
        hm.put(50.0, "Mohit");

        HashMap<String, Double> hm1 = new HashMap<>();

        Pair p2 = new Pair();
        p2.doSome("String");
        Integer x3 =  Pair.<String,Integer>doSomething("Mohit");

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        Util.printAnimals(dogs);
        List<? extends Animal> x = new ArrayList<Dog>();
        System.out.println(dogs);

//        List
    }
}

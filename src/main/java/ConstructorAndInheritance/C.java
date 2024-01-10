package ConstructorAndInheritance;

public class C extends B{
    C(){
        super();
        System.out.println("Constructor of C is called");
    }

    C(int x){
        System.out.println("something");
    }
    C(String param){
//        super("x");
        this(5);
        System.out.println("Para c is called " + param);
    }

}

// this() and super() both have to be in first line of your constructor

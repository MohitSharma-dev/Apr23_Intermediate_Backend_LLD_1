package ConstructorAndInheritance;

public class D extends C{
    D(){
        super("");
        System.out.println("Constructor of D is called");
    }

    D(String name){
        super("Call C");
        System.out.println("Name : " + name);
    }
}

package AbstractClasses;

public abstract class Animal {
    int noOfLegs;

    void eat(){
        System.out.println("Using mouth");
    }
    private void walk(){
        System.out.println("Walking");
    }
//    abstract void walk();
    abstract void makeSound();
}

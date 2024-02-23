package Exceptions;

public class Client {
    public static void main(String[] args) throws  ClassNotFoundException{
        Student s = new Student();
        System.out.println(s.something());
        // handle or main has to throw it futher
//        s.doSomething(50);
        try {
            s.doSomething(50);
            s.doSome(5);
            //
        } catch (ClassNotFoundException ex){
            System.out.println("STOP STOP!");
            throw new ClassNotFoundException();
            //
        } catch (EvenNumberException ex) {
            System.out.println("Even number found!");
        } catch (RuntimeException ex){
            System.out.println("RT Ex");
        } finally {
            System.out.println("I am in finally");
            throw new RuntimeException();
        }

//        System.out.println("I am outside try catch");

//        try {
//            // please try this code to run
//            // if this code runs succefully : normal
//            // if it fails, go to catch blocks
//        }
//            Stack
    }
}


// Exception : checked => you have to give the disclaimer : throws
// RuntimeException : disclaimer is not given in

// A, B , C, D
// A -> B -> C -> D
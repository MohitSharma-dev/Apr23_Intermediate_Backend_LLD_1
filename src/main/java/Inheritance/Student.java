package Inheritance;

public class Student extends User{
    double psp;
    String batch;

    public void attendClass(){
        System.out.println("Student is attending the class!");
    }

    public void doSomething(){
//        this.password = "zyz";
        this.name = "Mohit sharma";
    }
}

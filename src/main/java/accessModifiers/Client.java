package accessModifiers;

import IntroToOOP.Student;

public class Client extends Student{
    public static void main(String[] args) {
        Student x = new Student();
        // private can't be accessed outside the class
//        x.age = 45;
        x.name = "Mohit";
        x.batch = "Something";
        // default and protected can't be accessed outside the package
//        x.psp = 90.0;
//        x.gradYear = 2000;

    }

    public void doSomething(){
        this.gradYear = 2000;
    }
}

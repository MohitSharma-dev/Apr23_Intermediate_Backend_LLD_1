package IntroToOOP;

public class Client {
    public static void main(String[] args) {
        Student x = new Student();
//        x.age = 25;
        x.setAge(25);
        x.name = "Mohit";
        x.psp = 25.0;
        x.gradYear = 2000;
        x.batch = "Apr23";
        Student y = x;
        System.out.println(x.getAge());
    }
}

// public : anywhere
// private : only within the class
// protected :
                // 1. within the same package
                // 2. outside the package in a child class via child class object
// default : within the same package

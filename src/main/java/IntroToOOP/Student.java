package IntroToOOP;

public class Student {
    private int age;
    public String name;
    public String batch;
    double psp;
    protected int gradYear;

    void doSomething(){
        System.out.println("Something is being done!");
    }

    int getAge(){
        return age;
    }

    void setAge(int x){
        if(x <= 25){
            age = x;
        }
    }
}

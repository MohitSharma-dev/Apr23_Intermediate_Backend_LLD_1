package AbstractClasses;

public class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Bhau Bhau!");
    }

//    @Override
    public void walk() {
        System.out.println("I am not cat! why do you expect a walk from me!");
    }
}

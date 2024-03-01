package Decorator;

public class Decaf implements Bevarage{
    @Override
    public void getDesc() {
        System.out.println("Decaf has been added");
    }

    @Override
    public int getCost() {
        return 100;
    }
}

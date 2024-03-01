package Decorator;

public class Milk implements Addon{
    Bevarage b;

    Milk(Bevarage b){
        this.b = b;
    }
    @Override
    public int getCost() {
        return 2 + b.getCost();
    }

    @Override
    public void getDesc() {
        b.getDesc();
        System.out.println("Milk has been added");
    }
}

package Decorator;

public class Whip implements Addon{
    Bevarage b;

    Whip(Bevarage b){
        this.b = b;
    }
    @Override
    public void getDesc() {
        b.getDesc();
        System.out.println("Whip has been added");
    }

    @Override
    public int getCost() {
        return 23 + b.getCost();
    }
}

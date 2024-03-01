package Decorator;

public class HouseBlend implements Bevarage{
    @Override
    public void getDesc() {
        System.out.println("HouseBlend has been added");
    }

    @Override
    public int getCost() {
        return 50;
    }
}

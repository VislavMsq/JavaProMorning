package lesson2Plactice.strategy;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Don't fly");
    }
}

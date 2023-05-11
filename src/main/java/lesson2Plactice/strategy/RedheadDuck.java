package lesson2Plactice.strategy;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Qunack();
    }

    @Override
    public void display() {
        System.out.println("German duck");

    }
}

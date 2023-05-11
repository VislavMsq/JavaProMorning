package lesson2Plactice.strategy;

public class FlyWithJet implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly with Jet");
    }
}

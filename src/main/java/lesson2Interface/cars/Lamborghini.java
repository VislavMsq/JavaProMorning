package lesson2Interface.cars;

import lesson2Interface.cars.Car;

public class Lamborghini extends Car {

    public Lamborghini(String title) {
        super(title);
    }

    @Override
    public void stop() {
        System.out.println(getTitle() + " карбоно-керамика все остановит");
    }

    @Override
    public void turnOn() {
        System.out.println(getTitle() + " turn on with button");
    }
}

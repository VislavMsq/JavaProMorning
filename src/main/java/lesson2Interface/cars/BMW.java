package lesson2Interface.cars;

public class BMW extends Car {

    public BMW(String title) {

        super(title);           // ссылка на родителя
    }

    @Override
    public void stop() {
        System.out.println(getTitle() + " дисковое торможение");

    }

    @Override
    public void turnOn() {
        System.out.println(getTitle() + " turn on with key");

    }
}

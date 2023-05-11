package lesson2Interface.cars;

public interface Driveable {
    // в интерфейсе переменные всегда константы и статические, всегда сразу нужно им пресваивать значения
    String myClass = "Класс для автомобиля";

    public void drive();

    public void stop();

    default public void fly() {
        System.out.println("Машины не летают, но мы ждем свои решения, Илон Маск");

    }
}

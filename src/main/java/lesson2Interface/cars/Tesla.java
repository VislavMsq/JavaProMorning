package lesson2Interface.cars;

import lesson2Interface.cars.Car;

public class Tesla extends Car {
    public Tesla(String title) {
        super(title);               // вызов конструктора родительского класса
    }

    @Override
    public void stop() {
        System.out.println(getTitle() + " Остановились");
    }

    @Override
    public void fly() {
        // super.fly();             вызов ссылка на родительские метод
        System.out.println(getTitle() + " Начинаем полет");   // переопределяем метод
    }

    @Override
    public void turnOn() {
        System.out.println("Заводится ключем");
    }

    public void madeIn(){
        System.out.println("Сделано Tesla");
    }

    @Override
    public String toString() {
        return "Класс Tesla: " + super.getTitle();
    }
}

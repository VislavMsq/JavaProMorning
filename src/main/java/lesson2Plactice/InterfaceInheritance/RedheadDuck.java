package lesson2Plactice.InterfaceInheritance;

public class RedheadDuck extends Duck implements Flyable {    // Подключаем нужные нам интерфейсы
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}

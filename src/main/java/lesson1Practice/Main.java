package lesson1Practice;

public class Main {

    /*
    План занятия
    1) Приемы ООП
    2) Синглтон
     */

    /*
    Паттерны-проектирования - правильный способ решения задачи, антипаттерны - частые ошибки у программистов.
    Синглтон(одиночка) - паттерн, который гарантирует наличие только одного объекта у класса и предоставляет глобальную
    точку доступа к этому объекту

     */

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setName("Влад");
        System.out.println(singleton.toString());

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.toString());

        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
        chocolateBoiler.fill();
        chocolateBoiler.drain();
        ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();
        chocolateBoiler1.fill();
        chocolateBoiler1.boil();
        chocolateBoiler.drain();

    }
}

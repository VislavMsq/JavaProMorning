package lesson1Practice;

public class Singleton {

    private static Singleton instance;                    // Создаем объект этого типа и храним его в метаспейсе, даем к ними глобальный дсотуп
    private String name;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){                           // Проверяем существует ли объект класса, если нет, создаем его
            instance =  new Singleton();
        }
        return instance;                                // Возвращаем объект класса, в любом случае он будет один для всех вызовов
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
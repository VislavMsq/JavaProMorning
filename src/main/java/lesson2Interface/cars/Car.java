package lesson2Interface.cars;

public abstract class Car implements Driveable {

    private String title;

    public Car(String title) {
        this.title = title;

    }

    @Override
    public abstract void stop();

    public final void drive() {      // метод нельзя переопределять
        System.out.println(title + " is driving");

    }

    public abstract void turnOn();    // абстрактный метод который мы обьявляем и передаем его классу потомку, чтобы
    // чтобы в классах наследниках прописали доп пункционал его

    public String getTitle() {
        return title;
    }


}

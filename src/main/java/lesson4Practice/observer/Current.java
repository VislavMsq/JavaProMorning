package lesson4Practice.observer;

public class Current implements Observer{
    @Override
    public void update(int temp, float humidity, float pressure) {
        System.out.println("Данные изменены с учетом полученной информации для класса Current");
    }
}

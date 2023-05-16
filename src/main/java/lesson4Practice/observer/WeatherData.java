package lesson4Practice.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
/*
    ArrayList - класс, который позволяет работать с массивом, т.е в нем кроме самого массива уже есть основные методы для
        работы с ним.
 */
    private ArrayList observers = new ArrayList();
    private int temp;
    private float humidity;
    private float pressure;

    @Override
    public void registerObject(Observer observer) {
        observers.add(observer);    // добавляю наблюдателя в массив
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer); // удалить
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temp, humidity,pressure);
        }
    }

                    // параметры метода
    public void setChanges(int temp, float humidity, float pressure){
/*
    У нас параметры методов имеют такое же название как и поля класса, чтобы присвоить значения параметр полям
        восспользуемся словом this.
    this - это ссылка на текущий экземляр, т.е команда this.temp ызовет обьект класса и в нем возьмет поле. Таким образом
        команда:
    this.temp = temp - означает присвоить значения параметра temp полю обьекта temp

 */
        this.temp = temp;           // присваиваем новые значения
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();          // рассылаем данные наблюдателям
    }

}

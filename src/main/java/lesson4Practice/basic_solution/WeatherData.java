package lesson4Practice.basic_solution;

public class WeatherData {
    Statistics statistics;      // декларируем экземпляры класса
    Forecast forecast;
    Current current;

    public void change(int temp, float humidity, float pressure){
        current = new Current();        // инициализируем переменные классов, которые обьявили выше. теперь можно с ними корректно работать
        forecast = new Forecast();
        statistics = new Statistics();

        current.update(temp, humidity, pressure);       // обновляем данные
        forecast.update(temp, humidity, pressure);
        statistics.update(temp, humidity, pressure);
    }
}

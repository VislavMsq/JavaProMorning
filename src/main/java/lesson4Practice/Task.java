package lesson4Practice;
/*
Теория:
    Наблюдатель позволяет подключать к определенной рассылке информации слушателей. Пример поттерн Наблюдатель - рассылка
        газет. Можно как подписаться на получение газеты так и отписаться с нее. Стоит обратить внимание , что остальной
        функционал как продавца газет и покупателя никак не зависит от состояния подписки или отписки от газет - реализована
        так называемая слабая связь.

    Важное правило:
        Изменяемые параметры лучше программировать не на уровне класса, а на уровне интерфейса(создаем контракт)

    Задачу прочитать в книге на странице 72. 2я галава паттерн "Наблюдатель"

    Первый способ решения выявил отсутсвие гибкости подключения новых клиентов к нашей рассылке - попробуйте добавить пару
        классов в пакет basic_solution и получать в них данные из класса WeatherData. Насколько такой подход удобен?
        А что если нужно еще и отписывать несколько классов каждый день динамически. Поставьте, что
 */

import lesson4Practice.basic_solution.WeatherData;
import lesson4Practice.observer.Current;
import lesson4Practice.observer.Forecast;
import lesson4Practice.observer.MobileForecast;


public class Task {
//    static Object object;      // деклорация

    public static void main(String[] args) {
//        // если нет инициализации, то возникнет Exception - непридвиденная ситуация
////        object = new Object();          // инициализация переменной - теперь у ссылки есть значение в куче
//
//        try {   // проверить код(try - попробовать)  скобках указывается код, который может отработать некорректно
//            System.out.println(object.toString());
//        } catch (Exception ex) {    // catch - поймать. Блок кода вызывается в случае, если возникла непридвиденная ситуация в блоке try
//            System.out.println("что-то пошло не так");
//            ex.printStackTrace();   // ex - это метод класса Exception
//        }
//        System.out.println("Программа продолжает работать");


        // первый способ решения(пакет basic_solution)
        System.out.println("Работает простое решение");
        WeatherData weatherData = new WeatherData();
        weatherData.change(20, 40, 130);
        weatherData.change(21, 38, 127);

        // второй свособ решения
        System.out.println("Работает Observer: ");
        lesson4Practice.observer.WeatherData subject = new lesson4Practice.observer.WeatherData();
        lesson4Practice.observer.Current cur = new lesson4Practice.observer.Current();
        subject.removeObserver(cur);
        subject.setChanges(10, 45, 140);
        lesson4Practice.observer.Forecast cast = new lesson4Practice.observer.Forecast();
        subject.registerObject(cast);
        subject.setChanges(12, 43, 150);
        lesson4Practice.observer.MobileForecast mob = new lesson4Practice.observer.MobileForecast();
        subject.registerObject(mob);
        subject.setChanges(14, 38, 137);
        subject.removeObserver(cur);


    }
}
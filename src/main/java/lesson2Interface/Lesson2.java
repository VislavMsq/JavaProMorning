package lesson2Interface;

import lesson2Interface.array.ArrayWorking;
import lesson2Interface.cars.*;

public class Lesson2 {

/*
Теория:
    Интерфейсы относятся к классам(т.е к типам), но они абсолютно абстрактные, т.н имеют только абстрактные методы.
    Интерфейс тоже относится к программированию по контракту, т.е обязует своего наследника реализовать определенный
        функционал.
    Интерфейсы(абсюлютно абстрактные классы) нужны для реализации множественного наследования в Java., т.е унаследоваться
        от нескольких обычных классов нельзя по причине конфликтов между данными класса, например:
        class Car{
          void drive(){
           System.out.println("speed: 180");
           }
         }

        class Bike{
         void drive(){
          System.out.println("speed: 100");
          }
        }

    Если унаследоваться от класса Car и Bike, то по факту класс ребенок получито оба метода и между ними возникнит конфликт,
        чтобы избежать такой ситуации, множественное наследование реализовано через интерфейся, т.е даже если в классе
        потомке будут методы с таким же названием как в интерфейсе, программирование по конракту обязажет потомка самостоятельно
        реализовать этот метод и компилятор будет знать к какой реализации ему обращаться.

    На помощь в такой ситуации прийдут интерфейся

    Чтобы определить интерфейс нужно воспользоваться словом interface и в теле класса у казать абстрактные методы, т.е
        единственное отличие от классов в ключевом слове и том, что все методы интерфейся абстрактны.
    Для наследования от интерфейся указывается слово implement, если нужно реализовать(унаследовать) несколько интрефейсов
        они указываются через запятую, например:

    class Worker extends Human implements Runnable, ActionListener{

    }

    Класс Worker наследуется от класса Human и реализует интерфейс Runnable и ActionListener

    Композиция - передача функционала. Возможна не только средаствами наследования, но и средствами создания обьекта, т.е
        присоздании обьекта мы тоже передаем функционал класса, такой прием называется композицией. Если есть возможность
        не пользоваться наследованием, то пользуейтесь компизицией.
    Композиция - создание обьекта и обращение к его методам

    Иногда нужно запретить изменять класс, метод или переменную. Для этого существует модификатор final.
        final - константа(постаянная с латыни).
    Указывая переменную с модификатором final мы запрещаем ее изменять, метод запрещаем переопределять, класс запрещаем
        наследовать.


 */

/*
Заметки:
    В качестве примера библиотечных классов где представлена возможность множественного наследования, можно привести
        класс Thread и интерфейс Runnable, два класса нужны для того, чтобы программисти всегда мог унаследовать
        функционал многопоточности, даже если у его класса тоже есть класс родитель.
 */

    static final int CONST = 10;        // константная переменная

    public static void main(String[] args) {
        BMW bmw = new BMW("x5");
        bmw.drive();
        bmw.turnOn();
        bmw.stop();
        Lamborghini lamborghini = new Lamborghini("Diablo");
        lamborghini.drive();
        lamborghini.turnOn();
        lamborghini.stop();
        lamborghini.fly();

        Car car = new Car("Жигули") {   // Анонимный класс - реализация контракта на месте, для создания экземпляра
            @Override
            public void stop() {
                System.out.println(getTitle() + " ну посмотрим, может не сразу, но остановимся");
            }

            @Override                        // обьекта или интерфейса
            public void turnOn() {
                System.out.println(getTitle() + " возможно заведется");
            }
        };

        car.drive();
        car.turnOn();
        car.stop();

        // создали новый обьект и обязвтельно реализовали контракт асбстрактного метода turnOn
        Car car1 = new Car("Ford") {
            @Override
            public void stop() {
                System.out.println(getTitle() + " прекращает движение");
            }

            @Override
            public void turnOn() {
                System.out.println(getTitle() + " старая машина, тоже заводится ключем");
            }
        };

        car1.turnOn();
        car1.drive();
        car1.stop();
        System.out.println(Driveable.myClass);

        Tesla tesla = new Tesla("Tesla");
        tesla.turnOn();
        tesla.drive();
        tesla.stop();
        tesla.fly();

        Car car2 = new Tesla("Tesla");      // у потомка всегда будет функционал наследования

//        Tesla tesla1 = (Tesla) new Object();  // Потомок расширяет класс родителя, поэтому обратно по шаблону потомка нельзя
        // создать обьект родителя, т.к у родителя не может быть требуемого функциона


//        System.out.println("" + "" + tesla + "");
        print(1, 2, 3, 4, 5, 6, 7, 8, 9, " ", "Hello", tesla, 1.2, 'c',true);

        System.out.println();
        ArrayWorking arrayWorking = new ArrayWorking();
        arrayWorking.add(1);
        arrayWorking.add("hello");
        arrayWorking.add(tesla);
        arrayWorking.add(true);
        arrayWorking.add(12.4);
        arrayWorking.display();

        System.out.println("Удалил массив: ");
        arrayWorking.delete();
        arrayWorking.display();
        System.out.println("Взломали массив: ");
        arrayWorking.hack();
        arrayWorking.display();
        System.out.println("Стерли массив: ");
        arrayWorking.erase();
        arrayWorking.display();
        System.out.println("Снова взломали массив: ");
        arrayWorking.hack();
        arrayWorking.display();
    }

    // в методе при получении произвольного количества параметров создается массив, в котором они хранятся
    // ... указывает множество, то что мы париводим к массиву
    public static void print(Object ... arr) {        // позволяет принимать произвольное количество параметров и преобразует их в массив arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

package lesson2Plactice;

import lesson2Plactice.strategy.MallardDuck;
import lesson2Plactice.strategy.QryackDuck;
import lesson2Plactice.strategy.RedheadDuck;

public class Practice2 {

    /*
Теория:
    Наследование часто имеет побочные эффекты, поэтому необходимо использовать паттерны проектирования для реализации
        граммотной - гибкой архитектуры приложения.

    Стратегия - паттерн, который предназначен для инкапсуляции алгоритмов.

    Нужно искать изменяемые участки кода и выносить их в интерфейсы - это повысит гибкость архитектуры(см. пакеты
            SimpleInheritanse и InterfaceInheritance

    Приложение для учета уток. Утки разные и могут появится еще позже

    Проблема
    Сисьтема продолжает расширяться - появляются все новые и новые резиновые утки, необходимо обеспечить гибкую архитектуру
        для учета новых уток,чтобы их было бесполезнено добавлять.
     */
    public static void main(String[] args) {
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.performQuack();
        redheadDuck.performFly();

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        QryackDuck qryackDuck = new QryackDuck();
        qryackDuck.performFly();
        qryackDuck.performQuack();
    }
}

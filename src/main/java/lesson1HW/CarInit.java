package lesson1HW;

public interface CarInit {

    public abstract void keylessEntry();        // изменяемая опция - безключевой доступ, ответ да или нет

    public abstract void transmission();        // изменяемый метод для определения коробки передачь, автомат или ручная

    public abstract void brakeOnCar();          // изменяемый метод для определения тормозов на машине, дисковые или керамика
}

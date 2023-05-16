package lesson4Practice.observer;

public interface Subject {      // в данном патерне, тот кто отпровляет уведомления называется - субьект
    void registerObject(Observer observer);      // закладываем функционал для сервера
    void removeObserver(Observer observer);
    void notifyObservers();
}

package lesson1Practice;

public class ChocolateBoiler {
    private boolean empty;                   // Пустой ли бойлер
    private boolean boiled;                  // Нагрет ли шоколад
    private static ChocolateBoiler chocolateBoiler;


    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if(chocolateBoiler == null){
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    public void fill(){
        System.out.println("Заполняем бойлер");
        if(empty){
            empty = false;
            boiled = false;
            System.out.println("Бойлер заполнен");
        }

    }

    public void drain(){
        System.out.println("Опустошаем бойлер");
        if(!empty && boiled){
            empty = true;
            System.out.println("Бойлер опустошен");
        }

    }

    public void boil(){
        System.out.println("Разогреваем шоколад");
        if(!empty && !boiled){
            boiled = true;
            System.out.println("Шоколад разогрет");
        }

    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}

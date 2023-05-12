package lesson1HW;

public class Audi extends CarMain implements CarInit{
    public Audi(String brand, String model) {
        super(brand, model);
    }

    // переопределяем характеристику нашего обьекта
    @Override
    public void keylessEntry() {    // добавляем безключевой доступ
        System.out.println(getBrand() + getModel() + " - this car has keyless entry.");
    }

    @Override
    public void transmission() {    // добавляем автоматическую коробку передачь
        System.out.println(getBrand() + getModel() + " - this car has an automatic transmission.");
    }

    @Override
    public void brakeOnCar() {
        System.out.println(getBrand() + getModel() + " - this car has disc brakes.");
    }
}

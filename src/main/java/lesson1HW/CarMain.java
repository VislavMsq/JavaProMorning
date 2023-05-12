package lesson1HW;

public abstract class CarMain {
    String brand;
    String model;

    public CarMain(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public final void machineEngine(){          // двигатель у всех машин будет ДВС
        System.out.println(model + " this car has an engine ICE");
    }
    public  final void carBodyType(){           // тип кузова у всех машин - купе
        System.out.println(model + " car body type: Сoupe");
    }
//    public abstract void keylessEntry();        // изменяемая опция - безключевой доступ, ответ да или нет
//
//    public abstract void transmission();        // изменяемый метод для определения коробки передачь, автомат или ручная
//
//    public abstract void brakeOnCar();          // изменяемый метод для определения тормозов на машине, дисковые или керамика

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}

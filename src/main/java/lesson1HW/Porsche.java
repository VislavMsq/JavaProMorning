package lesson1HW;

public class Porsche extends CarMain{
    public Porsche(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void keylessEntry() {
        System.out.println(getBrand() + getModel() + " - access to this car with a key");
    }

    @Override
    public void transmission() {
        System.out.println(getBrand() + getModel() + " - this car has a manual transmission");
    }

    @Override
    public void brakeOnCar() {
        System.out.println(getBrand() + getModel() + " - This car has carbon ceramic brakes.");
    }
}

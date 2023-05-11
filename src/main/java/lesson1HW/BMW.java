package lesson1HW;

public class BMW extends CarMain{
    public BMW(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void keylessEntry() {
        System.out.println(getBrand() + getModel() + " - this car has keyless entry.");
    }

    @Override
    public void transmission() {
        System.out.println(getBrand() + getModel() + " - this car has an automatic transmission.");
    }

    @Override
    public void brakeOnCar() {
        System.out.println(getBrand() + getModel() + " - This car has carbon ceramic brakes.");
    }
}

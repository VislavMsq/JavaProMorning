package lesson1HW.wokers;

public class Security extends Workers{
    public Security(String position) {
        super(position);
    }

    @Override
    public void workerStartedWork() {
        System.out.println(getPosition() + " began guarding a car dealership");
    }
}

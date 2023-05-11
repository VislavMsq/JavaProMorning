package lesson1HW.wokers;

public class Salesman extends Workers{
    public Salesman( String position) {
        super(position);
    }

    @Override
    public void workerStartedWork() {
        System.out.println(getPosition() + " began to communicate with customers of the dealership");
    }
}

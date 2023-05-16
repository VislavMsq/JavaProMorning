package lesson4Practice.basic_solution;

public class Statistics {
    private int temp;
    private float humidity;
    private float pressure;

    public void update(int temp1, float humadity1,float pressure1){
        System.out.println("Ститистические данные обновились с учетом новых значений :" +
                temp1 + " " + humadity1 + " " + pressure1);
    }
}

package lesson4Practice.basic_solution;

public class Forecast {
    private int temp;
    private float humidity;
    private float pressure;

    public void update(int temp1, float humadity1,float pressure1){
        System.out.println("Прогнозные данные обновились с учетом новых значений :" +
                temp1 + " " + humadity1 + " " + pressure1);
    }
}

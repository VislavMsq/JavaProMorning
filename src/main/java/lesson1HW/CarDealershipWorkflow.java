package lesson1HW;

import lesson1HW.wokers.Manager;
import lesson1HW.wokers.Salesman;
import lesson1HW.wokers.Security;
import lesson1HW.wokers.Workers;

public class CarDealershipWorkflow {

    public void initWork(){
        Manager manager = new Manager("Manager");
        manager.workerStartedWork();
        Security security = new Security("Security");
        security.workersComeToWork();
        Salesman salesman = new Salesman("Salesman");
        salesman.workerStartedWork();
    }
    public void initWorkdiller(){
        Audi audi = new Audi("Audi", "A5");
        audi.carBodyType();
        audi.machineEngine();
        audi.keylessEntry();
        audi.transmission();
        audi.brakeOnCar();
        BMW bmw = new BMW("BMW", "M2");
        bmw.carBodyType();
        bmw.machineEngine();
        bmw.keylessEntry();
        bmw.transmission();
        bmw.brakeOnCar();
        Porsche porsche = new Porsche("Porsche","911");
        porsche.carBodyType();
        porsche.machineEngine();
        porsche.keylessEntry();
        porsche.transmission();
        porsche.brakeOnCar();
    }
}

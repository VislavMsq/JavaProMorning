package lesson3Summary;

import lesson3Summary.employee.Employee;
import lesson3Summary.vahicles.Vehicle;

public class MotorShow {
    private Employee [] employees = new Employee[100];
    private Vehicle[] vehicles = new Vehicle[1000];

    private int employeeCounter = 0;
    private int vehicleCounter = 0;

    public void fireAll(){
        employeeCounter = 0;
        employees = new Employee[employees.length];
    }
    // true if succeeded else false
    public boolean addVehicle(Vehicle vehicle) {
        if (employeeCounter == vehicles.length) {
            System.out.println("vehicle limit exceeded");
            return false;
        }
        vehicles[vehicleCounter] = vehicle;
        vehicleCounter++;
        return true;
    }
}

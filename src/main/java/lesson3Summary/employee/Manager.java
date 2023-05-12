package lesson3Summary.employee;

public class Manager extends Employee{
    public Manager(int salary) {
        super(salary);
    }
    public void  whoIm(){
        System.out.println("manager");
    }
}

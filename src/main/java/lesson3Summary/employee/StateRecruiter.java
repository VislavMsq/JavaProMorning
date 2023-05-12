package lesson3Summary.employee;

public class StateRecruiter extends Employee implements Recruiter{
    public StateRecruiter(int salary) {
        super(salary);
    }

    @Override
    public Employee hire(String type) {
        if(type == "selesman"){
            return new Salesman(100);
        } else if (type == "secerity") {
            return new Salesman(90);
        } else if (type == "manager") {
            return new Salesman(110);
        } else if (type == "recruiter") {
            return new Salesman(100);
        } else {
            throw new RuntimeException("Incorrenct employee type");
        }
    }
}

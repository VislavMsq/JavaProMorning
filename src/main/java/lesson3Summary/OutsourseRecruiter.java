package lesson3Summary;

import lesson3Summary.employee.*;

public class OutsourseRecruiter {
    public static class OutsourceRecruiter implements Recruiter {
        @Override
        public Employee hire(String type) {
            if(type == "selesman"){
                return new Salesman(100);
            } else if (type == "secerity") {
                return new Security(90);
            } else if (type == "manager") {
                return new Manager(110);
            } else if (type == "recruiter") {
                return new StateRecruiter(100);
            } else {
                throw new RuntimeException("Incorrect employee type");
            }
        }
    }
}

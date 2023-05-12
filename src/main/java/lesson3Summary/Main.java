package lesson3Summary;

import lesson3Summary.employee.*;

public class Main {
    public static void main(String[] args) {

        Recruiter recruiter1 = new StateRecruiter(1000);
        Recruiter recruiter2 = (Recruiter) new OutsourseRecruiter();

        recruiter1.hire("selesman");
        recruiter1.hire("selesman");
    }
}

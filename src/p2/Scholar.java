package p2;

public class Scholar extends Student{
    String scholarship;
    double monthlyAmount;
    Scholar(String name, int age, String matriculationNumber, String fieldOfStudy, String scholarship, double monthlyAmount) {
        super(name, age, matriculationNumber, fieldOfStudy);
        this.scholarship = scholarship;
        this.monthlyAmount = monthlyAmount;
    }
}

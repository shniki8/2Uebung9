package again.p2;

public class ScholarBuilder extends StudentBuilder<ScholarBuilder> {
    String scholarship;
    double monthlyAmount;

    public ScholarBuilder setMonthlyAmount(double monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
        return this;
    }

    public ScholarBuilder setScholarship(String scholarship) {
        this.scholarship = scholarship;
        return this;
    }
    public Scholar build(){
        return new Scholar(name, age, matriculationNumber, fieldOfStudy,scholarship,monthlyAmount);
    }
}

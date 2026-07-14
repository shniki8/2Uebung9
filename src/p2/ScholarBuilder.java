package p2;

public class ScholarBuilder extends StudentBuilder{
    String scholarship;
    double monthlyAmount;
    public ScholarBuilder setScholarship(String s){
        scholarship = s;
        return this;
    }
    public ScholarBuilder setMonthlyAmount(double d){
        monthlyAmount = d;
        return this;
    }
    public Scholar build(){
        return new Scholar(name,age,matriculationNumber,fieldOfStudy,scholarship,monthlyAmount);
    }
}

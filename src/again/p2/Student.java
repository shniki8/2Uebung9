package again.p2;

public class Student extends Person{
    String matriculationNumber, fieldOfStudy;

    public Student(String name, int age, String matriculationNumber, String fieldOfStudy) {
        super(name, age);
        this.matriculationNumber = matriculationNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    @Override
    public String toString() {
        return super.toString() + " " + matriculationNumber + " " + fieldOfStudy; //lazy
    }
}

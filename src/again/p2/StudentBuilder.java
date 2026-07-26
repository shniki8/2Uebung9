package again.p2;

public class StudentBuilder extends PersonBuilder<StudentBuilder>{
    String matriculationNumber, fieldOfStudy;

    public StudentBuilder setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
        return this;
    }

    public StudentBuilder setMatriculationNumber(String matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
        return this;
    }
    Student build(){
        return new Student(name,age,matriculationNumber,fieldOfStudy);
    }
}

package again.p2;

public class StudentBuilder<T extends StudentBuilder<T>> extends PersonBuilder<T>{
    String matriculationNumber, fieldOfStudy;

    public T setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
        return (T)this;
    }

    public T setMatriculationNumber(String matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
        return (T)this;
    }
    Student build(){
        return new Student(name,age,matriculationNumber,fieldOfStudy);
    }
}

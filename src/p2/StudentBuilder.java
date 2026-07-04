package p2;

public class StudentBuilder extends PersonBuilder<StudentBuilder>{
    String matriculationNumber;
    String fieldOfStudy;
    StudentBuilder setMatriculationNumber(String m){
        matriculationNumber = m;
        return this;
    }
    StudentBuilder setFieldOfStudy(String s){
        fieldOfStudy = s;
        return this;
    }
    public Student build(){
        return new Student(name,age,matriculationNumber,fieldOfStudy);
    }
}

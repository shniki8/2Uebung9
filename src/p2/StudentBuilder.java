package p2;

public class StudentBuilder<T extends Student> extends PersonBuilder<StudentBuilder<T>>{
    String matriculationNumber;
    String fieldOfStudy;
    StudentBuilder<T> setMatriculationNumber(String m){
        matriculationNumber = m;
        return this;
    }
    StudentBuilder<T> setFieldOfStudy(String s){
        fieldOfStudy = s;
        return this;
    }
    public Student build(){
        return new Student(name,age,matriculationNumber,fieldOfStudy);
    }
}

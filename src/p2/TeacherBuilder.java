package p2;

public class TeacherBuilder extends PersonBuilder<TeacherBuilder>{
    String subject;

    TeacherBuilder setSubject(String s){
        subject = s;
        return this;
    }
    public Teacher build(){
        return new Teacher(name, age, subject);
    }
}

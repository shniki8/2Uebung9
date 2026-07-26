package again.p2;

public class TeacherBuilder extends PersonBuilder<TeacherBuilder> {
    String subject;

    public TeacherBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    Teacher build() {
        return new Teacher(name,age,subject);
    }
}

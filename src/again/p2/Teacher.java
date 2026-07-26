package again.p2;

public class Teacher extends Person{
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + " " + subject;
    }
}

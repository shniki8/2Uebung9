package p2;

public class BuilderDemo {
    public static void main(String[] args) {
        Student s = new StudentBuilder<Student>()
                .setName("Anna Schmidt")
                .setAge(22)
                .setMatriculationNumber("12345")
                .setFieldOfStudy("B.Sc. Informatik")
                .build();
        Teacher t = new TeacherBuilder()
                .setName("Alan Wake")
                .setAge(69)
                .setSubject("Sleep")
                .build();
        System.out.println(s);
        System.out.println(t);
        //g): damit nur PersonBuilder mit Subtyp von sich selbst parameterisiert werden kann.
        // würde man die Rückgabe Typen auf PersonBuilder ändern, wurden die Methoden nicht mehr für Subtypen
        // von PersonBuilder funktionieren, sondern nur noch für PersonBuilder selbst, atp kann man sich das dann auch sparen
        // bzw. man könnte die Subtypen zu PersonBuilder casten aber es gehen Infos verloren und bei der Verkettung kommt es zu problemen weil die Methoden ggf. spezifischere Typen erwarten
        // spätestens build würde dann nicht korrekt funktioneren
    }
}

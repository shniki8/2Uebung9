package p1;

public class Main {
    public static void main(String[] args) {
        IdGenerator idGenerator = new IdGenerator();
        System.out.println(idGenerator.createId("69696969", "Prof. Oak", "Biology"));
        System.out.println(idGenerator.createCourseList("Einführung in die Programmierung", "Mathematik für Studierende der Informatik I", "Database Systems"));
    }
}

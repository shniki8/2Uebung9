package p2;

public class Person {
    int age;
    String name;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "" + name + " (" + age + ")";
    }
}

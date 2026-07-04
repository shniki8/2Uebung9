package p2;

public class PersonBuilder<T extends PersonBuilder<T> > {
    int age;
    String name;
    public T setAge(int age) {
        this.age = age;
        return (T) this;
    }
    public T setName(String name) {
        this.name = name;
        return (T) this;
    }
    public Person build() {
        return new Person(name, age);
    }
}

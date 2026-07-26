package again.p2;

public class PersonBuilder<T extends PersonBuilder<T>>{
    String name; int age;

    T setName(String name){
        this.name = name;
        return (T)this;
    }
    T setAge(int age){
        this.age = age;
        return (T)this;
    }
    Person build(){
        return new Person(name,age);
    }
}

package p4;

public class Fruit {
    String name;
    public Fruit(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

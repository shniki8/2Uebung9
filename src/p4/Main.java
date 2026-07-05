package p4;

public class Main {
    public static void main(String[] args) {
        Box<Fruit> bf = new Box<>(); //bf != boyfriend
        Box<Apple> ba = new Box<>();
        ba.put(new Apple("Green Apple"));
        ba.put(new Apple("Red Apple"));
        ba.put(new Apple("Tasty Apple"));
        ba.put(new Apple("Juicy Apple"));
        Box<Orange> bo = new Box<>(); // Imagine man liest das und ist Orangen hater ...
        bo.put(new Orange("Orange Orange")); // :)
        bo.put(new Orange("Round Orange"));
        bo.put(new Orange("Juicy Orange"));
        BoxUtils.mirror(ba);
        BoxUtils.fill(ba, new Apple("Red Apple"),new Apple("Red Apple"));
        BoxUtils.fill(bo, new Orange("Orange Orange"), new Orange("Orange Orange"));
        // f: 1: Nein, 2: Ja, 3: Nein.
        //Bin müde, eventuell falsch. Hab unter 1 Min nachgedacht
    }
}

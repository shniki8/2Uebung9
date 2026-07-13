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

        //neues Zeug:
        Box<? extends Fruit> producer = new Box<Apple>();
        Box<? super Apple> consumer = new Box<Fruit>();
        //Fruit f = producer.get(0); // geht, falls producer nichtleer.
        //  producer.put(new Apple("Test")); // geht nicht
        consumer.put(new Apple("HelloWorld-Apple")); //geht
        // Apple a = consumer.get(0); //geht nicht
        Box<? extends Apple> box = new Box<Apple>();
        //box.put(new Apple("Gala")); //Wie erwartet.
        Box<String> stringBox = new Box<>();
        Box raw = stringBox;
        raw.put(42);
        System.out.println(raw.get(0).getClass());


    }
}

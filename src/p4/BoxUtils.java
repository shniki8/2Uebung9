package p4;

public class BoxUtils {
    public static <T> void mirror(Box<T> box){
        for (int i = box.size()-1; i >= 0; i--) {
            box.put(box.get(i));
            //Geht nicht mit Fruit Objekt einfügen, weil nicht sichergestellt ist, dass das überhaupt möglich ist. T kann alles sein.
        }
        // wäre Box<? extends T> könnte ? die Methode put überschreiben was zu Problemen führen könnte.
        // wäre Box<? super T> wäre nicht sichergestellt das diese Methode überhaupt in ? existiert.
    }
    public static void printAll(Box<? extends Fruit> box){
        for (int i = 0; i < box.size(); i++) {
            System.out.println(box.get(i));
        }
    }
    public static <T> void fill(Box<? super T> box, T... items){
        for (T item : items){
            try {
                box.put(item);
            } catch (Exception e) {
                System.out.println("Box is full or error occurred");
            }
        }
    }
    public static <T> void transfer(Box<? super T> dest, Box<? extends T> src){
        for (int i = 0; i < src.size(); i++) {
            dest.put(src.get(i));
        }
    }


}

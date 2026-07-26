package again.p4;

import java.util.ArrayList;

public class BoxUtils {

    static <T> void mirror(Box<T> box){
        ArrayList<T> al = new ArrayList<>();
        for (int i = 0; i < box.size(); i++) {
            al.addFirst(box.get(i));
        }
        for (T t : al){
            box.put(t);
        }
    }
    public static void printAll(Box<? extends Fruit> box){
        for (int i = 0; i < box.size(); i++) {
            System.out.println(box.get(i));
        }
    }

    public static <T> void fill(Box<? super T> box, T... items){
        for (T t : items){
            box.put(t);
        }
    }
    public static <T> void transfer(Box<? super T> dest, Box<? extends T> src){
        for (int i = 0; i < dest.size(); i++) {
            dest.put(src.get(i));
        }
    }

}

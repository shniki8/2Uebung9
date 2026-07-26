package again.p4;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    List<T> items = new ArrayList<>();
    void put(T item){
        items.add(item);
    }
    T get(int index){
        return items.get(index);
    }
    int size(){
        return items.size();
    }



}

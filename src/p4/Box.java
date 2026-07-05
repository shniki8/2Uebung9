package p4;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> items = new ArrayList<>();
    public void put(T item){
        items.add(item);
    }
    public T get(int index){
        return items.get(index);
    }
    public int size(){
        return items.size();
    }
}

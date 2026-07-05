package p3;

public class Sensor implements Comparable<Sensor>{
    Double value;
    public Sensor(Double value){
        this.value = value;
    }
    @Override
    public int compareTo(Sensor o) {
        return value.compareTo(o.value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}



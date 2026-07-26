package again.p3;

public class Sensor implements Comparable<Sensor>{
    double value;

    public Sensor(double value) {
        this.value = value;
    }

    @Override
    public int compareTo(Sensor o) {
        return Double.compare(value, o.value);
    }
}

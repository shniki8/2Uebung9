package p3;

public class TemperatureSensor extends Sensor{
    String unit;
    public TemperatureSensor(Double value, String unit) {
        super(value);
        this.unit = unit;
    }

    @Override
    public String toString() {
        return super.toString() + " " + unit;
    }
}

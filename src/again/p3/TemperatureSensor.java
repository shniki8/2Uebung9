package again.p3;

public class TemperatureSensor extends Sensor{
    String unit;

    public TemperatureSensor(double value, String unit) {
        super(value);
        this.unit = unit;
    }


    @Override
    public String toString() {
        return value + " " + unit;
    }
}

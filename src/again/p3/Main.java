package again.p3;

public class Main {
    TemperatureSensor t1 = new TemperatureSensor(20, "Celsius");
    TemperatureSensor t2 = new TemperatureSensor(40, "Celsius");
    TemperatureSensor t3 = SensorUtils.findMax(t1,t2);

}

package p3;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor tp1 = new TemperatureSensor(30.1, "Celsius");
        TemperatureSensor tp2 = new TemperatureSensor(38.2, "Celsius");
        TemperatureSensor tp3 = new TemperatureSensor(SensorUtils.findMax(tp1,tp2).value, "Celsius");
        System.out.println(tp3);
        tp3 = (TemperatureSensor) SensorUtils.findMax(tp1,tp2);
        //Meine Vermutung warum er nicht direkt TemperatureSensor zurückgibt: Nur Sensor implementiert Comparable und TemperatureSensor
        //überschreibt es lediglich, ich denke deshalb wird das genommen, was tatsächlich eine direkte Implementation ist? Außerdem hat nur Sensor compareTo() liegt also sowieso auch daran.
        tp3 = SensorUtils.findMax(tp1,tp2);
        //Schranke von extends Comparable<T> zu Sensor geändert.
        //Löst das Problem da alle Subtypen von Sensor eh compareTo haben, also das vorhandensein dieser Methode garantiert ist und so auch ein kompatibler Subtyp zurückgegeben werden kann.


    }
}

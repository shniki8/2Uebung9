package again.p3;

public class SensorUtils {


    public static <T extends Sensor> T findMax(T a, T b){
        if (a.compareTo(b) >= 0) return a;
        else return b;
    }
}

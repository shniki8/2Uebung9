package p3;

public class SensorUtils {
    public static <T extends Sensor> T findMax(T a, T b){
        int i;
        try {
            i = a.compareTo(b);
        }catch(Exception e) {
            return null;
        }
        return (i>=0) ? (T)a : (T)b;
    }
}

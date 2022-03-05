package laboratoire3;

public class Chrono {
    static private long startTime;
    static private long stopTime;

    public static void start(){
        startTime = System.nanoTime();
    }

    public static void stop(){
        stopTime = System.nanoTime();
    }

    public static double timeInSec(){
        return (double)(stopTime - startTime)*10e-9;
    }

}

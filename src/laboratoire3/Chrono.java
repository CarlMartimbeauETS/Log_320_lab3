package laboratoire3;

public class Chrono {
    private long startTime = 0;
    private long stopTime = 0;

    public void start(){
        startTime = System.nanoTime();
    }

    public void stop(){
        stopTime = System.nanoTime();
    }

    public double timeInSec(){
        return (double)(stopTime - startTime)*10e-9;
    }

}

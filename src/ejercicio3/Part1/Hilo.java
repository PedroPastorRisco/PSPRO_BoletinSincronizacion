package ejercicio3.Part1;

public class Hilo implements Runnable{
    private int numHilo;

    public Hilo(int i) {
        this.numHilo=i;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

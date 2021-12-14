package ejercicio1.Part2;

public class Hilo implements Runnable {
    private int numHilo, numIncrementos=0;
    private final Contador contador;

    public Hilo(int numHilo,Contador contador){
        this.numHilo=numHilo;
        this.contador=contador;
    }

    @Override
    public void run() {
        while(contador.incrementar()){
            numIncrementos++;
        }
        System.out.println("El hilo "+numHilo+" ha hecho "+numIncrementos+" incrementos");
    }
}

package ejercicio1.Part1;

import java.util.Random;

public class Hilo implements Runnable{
    int numHilo;

    public Hilo(int numHilo){
        this.numHilo=numHilo;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Random random = new Random();
        int numRandom = random.nextInt(21),factorial=1;

        for(int i=1;i<=numRandom;i++){
            factorial*=i;
        }
        System.out.println("El factorial de "+numRandom+" es "+factorial);
    }
}

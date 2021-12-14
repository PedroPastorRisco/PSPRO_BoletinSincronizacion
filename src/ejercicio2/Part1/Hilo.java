package ejercicio2.Part1;

import java.util.Random;

public class Hilo implements Runnable{
    private int numHilo;
    private int[] numeros= new int[10000];

    public Hilo(int numHilo){
        Random random = new Random();

        this.numHilo=numHilo;
        for(int i=0;i<numeros.length;i++){
            numeros[i]=random.nextInt(2);
        }
    }

    @Override
    public void run() {
        double media=0;

        for (int n:numeros) {
            media+=n;
        }
        media=media/10000;

        System.out.println("La media del hilo "+numHilo+" es: "+media);
    }
}

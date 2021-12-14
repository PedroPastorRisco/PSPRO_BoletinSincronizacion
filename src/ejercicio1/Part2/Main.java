package ejercicio1.Part2;

import ejercicio1.Part2.Hilo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Thread> hilos= new ArrayList<>();
        Thread hilo;
        Contador contador=new Contador();

        for (int i=1;i<=10;i++){
            hilo = new Thread(new Hilo(i,contador));
            hilos.add(hilo);
        }
        for (Thread h:hilos) {
            h.start();
        }
    }

}

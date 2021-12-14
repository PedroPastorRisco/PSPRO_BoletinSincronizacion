package ejercicio2.Part2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Thread> hilos = new ArrayList<>();
        Thread hilo;
        Comunicacion comunicacion = new Comunicacion();

        for(int i=1;i<=10;i++){
            hilo = new Thread(new Hilo(i,comunicacion));
            hilos.add(hilo);
        }

        for (Thread h : hilos) {
            h.start();
        }
    }
}

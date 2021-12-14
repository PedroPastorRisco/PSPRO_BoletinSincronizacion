package ejercicio2.Part1;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Thread> hilos = new ArrayList<>();
        Thread hilo;

        for(int i=0;i<10;i++){
            hilo = new Thread(new Hilo(i));
            hilos.add(hilo);
        }
        for (Thread h : hilos) {
            h.start();
            try {
                h.join();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hilos terminados");
    }
}

package ejercicio2.Part2;

public class Hilo implements Runnable {
    private int numHilo;
    private Comunicacion comunicacion;

    public Hilo(int numHilo,Comunicacion comunicacion){
        this.numHilo=numHilo;
        this.comunicacion=comunicacion;
    }

    @Override
    public void run() {
        for(int i=1;i<=3;i++){
            comunicacion.enviar("Datos "+i+" del hilo "+numHilo);
        }
    }
}

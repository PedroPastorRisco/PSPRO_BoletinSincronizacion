package ejercicio2.Part2;

public class Comunicacion {

    public Comunicacion(){

    }
    public synchronized void enviar(String datos){
        System.out.println(datos);
    }
}

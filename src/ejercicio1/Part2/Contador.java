package ejercicio1.Part2;

public class Contador {
    int contador=0;

    public synchronized boolean incrementar(){
        boolean incremento=false;

        if(contador<1000){
            contador++;
            incremento=true;
        }
        return incremento;
    }
}

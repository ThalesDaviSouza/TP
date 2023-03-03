package CorridaDeSapos;

public class Sapo extends Thread{
    private int distanciaPercorrida;
    private int distanciaPulo;
    private int id;
    private int distanciaCorrida;

    public Sapo(int dPercorrida, int dPulo, int id, int distanciaCorrida){
        distanciaPercorrida = dPercorrida;
        distanciaPulo = dPulo;
        this.id = id;
        this.distanciaCorrida = distanciaCorrida;
    }

    public void run(){
        System.out.println("Sapo #" + id + " começou a correr.");
        do{
            distanciaPercorrida += distanciaPulo;
        }while(distanciaPercorrida < distanciaCorrida);
        System.out.println("Sapo #" + id + " chegou.");
    }

    public int getDistanciaP(){
        return distanciaPercorrida;
    }

}

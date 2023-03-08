package CorridaDeSapos;
import java.util.*;


public class Sapo extends Thread{
    private int distanciaPercorrida;
    private int distanciaPulo;
    private int id;
    private int distanciaCorrida;
    private int numSapos;
    public static List<Sapo> OrdemChegada = new ArrayList<Sapo>();

    public Sapo(int dPercorrida, int dPulo, int id, int distanciaCorrida, int numSapos){
        distanciaPercorrida = dPercorrida;
        distanciaPulo = dPulo;
        this.id = id;
        this.distanciaCorrida = distanciaCorrida;
        this.numSapos = numSapos;
    }

    public void run(){
        System.out.println("Sapo #" + id + " começou a correr (vel: " + distanciaPulo + "m).");
        try{
            do{
                this.distanciaPercorrida += this.distanciaPulo;
            }while(distanciaPercorrida < distanciaCorrida);
            Chegada();
            printColocacoes();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void Chegada(){
        OrdemChegada.add(this);
    }

    public int getDistanciaP(){
        return distanciaPercorrida;
    }

    public void printColocacoes(){
        if(OrdemChegada.size() == numSapos){
            OrdemChegada.forEach(e -> System.out.println("O sapos " + e.id + "# ficou em " + (OrdemChegada.indexOf(e)+1)));
        }
    }

}

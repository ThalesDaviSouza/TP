package CorridaDeSapos;
import java.util.*;

public class Corrida {
    static final int distanciaCorrida = 100;
    static final int numSapos = 10;

    public static void main(String[] args) {
        List<Sapo> sapos = new ArrayList<Sapo>();
        for(int i = 0; i < numSapos; i++){
            sapos.add(new Sapo(0, 5, i, distanciaCorrida));
        }
        
        for (Sapo sapo : sapos) {
            sapo.start();
        }
        
    }
    
    

    
}

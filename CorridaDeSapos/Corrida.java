package CorridaDeSapos;
import java.time.chrono.ThaiBuddhistChronology;
import java.util.*;

public class Corrida {
    static final int distanciaCorrida = 100;
    static final int numSapos = 5;

    public static void main(String[] args) {
        Random rand = new Random();
        List<Sapo> sapos = new ArrayList<Sapo>();
        for(int i = 1; i <= numSapos; i++){
            sapos.add(new Sapo(0, rand.nextInt(10) + 1, i, distanciaCorrida, numSapos));
        }
        try {
            sapos.forEach(s -> s.start());
        } catch (Exception e) {}
    }
}

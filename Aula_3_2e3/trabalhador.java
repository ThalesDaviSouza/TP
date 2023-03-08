public class trabalhador extends Thread{
    String produto ;
    int tempo ;

    public trabalhador ( String produto, int tempo ){
        this.produto = produto ;
        this.tempo = tempo ;
    }

    public void run () {
        int i = 0;
        boolean parar = false;
        do {
            System.out.println(i + " " + produto );
            try {
                sleep((long)(Math.random() * tempo));
            }catch(InterruptedException e) {}
            i++;
            parar = Parar(i);
        }while(parar);
        System.out.println("Terminei " + produto );  
    }

    public boolean Parar(int i){
        if(i == 5){
            return false;
        }
        return true;
    }
}

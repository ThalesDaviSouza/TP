package Aula_2_3;

public class ContadorDec implements Runnable{
    private int count = 100;
    
    public void run(){
        try{
            if(count > 100){
                throw new CannotIncException("Count above 100");
            }else if(count < 0){
                throw new CannotIncException("Count is less than 0");
            }else{
                System.out.println("Counter: " + count);
                count--;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

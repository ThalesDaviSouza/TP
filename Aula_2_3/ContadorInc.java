package Aula_2_3;

public class ContadorInc implements Runnable{
    private int count = 0;
    
    public void run(){
        try{
            if(count > 100){
                throw new CannotIncException("Count above 100");
            }else if(count < 0){
                throw new CannotIncException("Count is less than 0");
            }else{
                System.out.println("Counter: " + count);
                count++;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

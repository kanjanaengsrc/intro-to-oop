package Aggregation;
import java.util.concurrent.TimeUnit;

public class Wheel {
    private String diameter;
    private boolean status;
    public Wheel(){
        this.diameter = "18 inches";
        this.status = true;
    }
    public void FillAir(int pound){
        for(int i =0;i<=pound;i++){
            System.out.print(".");
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(Exception e){
                System.err.println(e);
            }
        }
        System.out.println();
        this.status = false;
    }
    public boolean isTireFlat(){
        return status;
    }
}
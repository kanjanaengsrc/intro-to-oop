package Aggregation;
import java.util.ArrayList;

public class Car {
    private String serie;
    private Engine engine;
    private ArrayList<Wheel> wheels;

    public Car(String serie, Engine engine, ArrayList<Wheel> wheels) {
        this.serie = serie;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void Move() {
        System.out.printf("%s is moving\n", this.serie);
        engine.Accerate(30);
    }

    public String getSerie(){
        return this.serie;
    }
    public int getCapacity(){
        return this.engine.getCC();
    }
    public void CheckWheelAir(){
        for (Wheel wheel : this.wheels) {
            if(wheel.isTireFlat()){
                System.out.println("Wheel is flat!");
                System.out.println("Filling air is begin");
                wheel.FillAir(1);
            }
        }
    }
}
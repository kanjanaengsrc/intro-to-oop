package Aggregation;
public class Engine {
    private int capacity;
    private int numOfCylinder;
    public Engine(int c, int num){
        this.capacity = c;
        this.numOfCylinder = num;
    }
    public void Start(){
        System.out.println("Engine started");
    }
    public void Accerate(double speed){
        System.out.printf("Engine is reaching to %.2f km/h\n",speed);
    }
    public void Break(){
        System.out.println("Car is stopped");
    }
    public int getCC(){
        return this.capacity;
    }
}
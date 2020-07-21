package Aggregation;
import java.util.ArrayList;

public class TestCar {
    public static void main(String[] args) {
        Engine engine = new Engine(3000, 5);
        ArrayList<Wheel> wheels = new ArrayList<Wheel>();
        for (int i = 0; i <= 3; i++) {
            wheels.add(new Wheel());
        }
        Car benz = new Car("Benz", engine, wheels);
        System.out.printf("%s with %d is created\n",
            benz.getSerie(),benz.getCapacity());
        
        benz.CheckWheelAir();
        benz.Move();
    }
}
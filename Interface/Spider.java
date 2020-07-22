package Interface;

public abstract class Spider {
    protected int numOfLegs;
    public Spider(int legs){
        this.numOfLegs = legs;
    }
    protected void Climb(){
        System.out.println("Climb on the wall");
    }
}
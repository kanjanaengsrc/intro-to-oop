package Inheritance;
public class Frog extends Animal{
    public Frog(String name){
        super(name);
    }
    public void move(){
        System.out.println(this.getName()+
        " Jump Jump Jump");
    }
}
class Fish extends Animal{
    public Fish(String name){
        super(name);
    }
    public void move(){
        System.out.println(getName()+
        " is swimming");
    }
}
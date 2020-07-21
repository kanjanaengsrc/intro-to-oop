package Inheritance;
public class Zoo{
    public static void main(String[] args) {
        Fish nemo = new Fish("Nemo");
        nemo.move();
        Animal anyone = new Frog("Kero");
        anyone.move();
        anyone = nemo;
        anyone.move();
    }
}

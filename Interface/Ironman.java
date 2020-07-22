package Interface;

public class Ironman implements Superhero {
    private String weapon;
    public Ironman(String w){
        this.weapon = w;
    }
    @Override
    public void UseWeapon() {
        System.out.printf("use %s to attack monster. ",this.weapon);
    }
    @Override
    public void Move() {
        System.out.println("fly with engine\n");
    }
    
}
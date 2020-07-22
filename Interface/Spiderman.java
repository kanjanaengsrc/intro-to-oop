package Interface;
public class Spiderman extends Spider implements Superhero {
    private String weapon;
    public Spiderman(int legs,String w) {
        super(legs);
        this.weapon = w;
    }
    @Override
    public void UseWeapon() {
        System.out.printf("use %s to attack monster. ",this.weapon);
    }
    @Override
    public void Move() {
        System.out.printf("walk on %d legs\n",this.numOfLegs);
    }
}
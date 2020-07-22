package Interface;

public class TestHero {
    public static void main(String[] args) {
        Superhero ir = new Ironman("Gun");
        Superhero sp = new Spiderman(2, "Web");
        System.out.print("Ironman ");
        ir.UseWeapon();
        System.out.print(" and ");
        ir.Move();
        System.out.print("Spiderman ");
        sp.UseWeapon();
        System.out.print(" and ");
        sp.Move();
    }
}
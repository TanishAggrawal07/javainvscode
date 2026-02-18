public class Wizard extends GameCharacter {
    private int magicPower;

    public Wizard(String name, int health, int magicPower) {
        super(name, health);
        this.magicPower = magicPower;
    }

    public void attack(GameCharacter target) {
        int damage = magicPower * 3;
        System.out.println(name + " casts a spell at " + target.name + ", dealing " + damage + " magic damage.");
    }
}
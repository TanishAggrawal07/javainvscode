public class Warrior extends GameCharacter {
    private int strength;

    public Warrior(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }

    @Override
    public void attack(GameCharacter target) {
        int damage = strength * 2;
        System.out.println(name + " smashes " + target.name + " for " + damage + " damage!");
    }
}
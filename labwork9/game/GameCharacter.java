public class GameCharacter {
    protected String name;
    protected int health;

    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack(GameCharacter target) {
        System.out.println("The character attacks.");
    }
}
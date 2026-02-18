public class Main {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior("Thor", 100, 10);
        GameCharacter wizard = new Wizard("Merlin", 80, 8);

        warrior.attack(wizard);
        wizard.attack(warrior);
    }
}
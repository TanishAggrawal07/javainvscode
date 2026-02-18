// package labwork7;

public class SmartLight extends SmartDevice {
    int brightnessLevel;

    public SmartLight(String name, int brightnessLevel) {
        super(name);
        this.brightnessLevel = brightnessLevel;
    }

    public void brighten() {
        if (brightnessLevel < 100) brightnessLevel += 10;
    }

    public void dim() {
        if (brightnessLevel > 0) brightnessLevel -= 10;
    }

    @Override
    public void displayStatus() {
        System.out.println(name + " is " + (isOn ? "ON" : "OFF") +
                " at " + brightnessLevel + "% brightness.");
    }
}

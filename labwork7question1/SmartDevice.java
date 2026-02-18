// package labwork7;

public class SmartDevice {
    String name;
    boolean isOn;

    public SmartDevice(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void togglePower() {
        isOn = !isOn;
    }

    public void displayStatus() {
        System.out.println(name + " is " + (isOn ? "ON" : "OFF"));
    }
}

// package labwork7;

public class Main {
    public static void main(String[] args) {
        SmartLight light = new SmartLight("Living Room Light", 50);
        SmartThermostat thermostat = new SmartThermostat("Home Thermostat", 22);

        light.displayStatus();
        thermostat.displayStatus();

        light.togglePower();
        light.brighten();
        light.displayStatus();

        thermostat.togglePower();
        thermostat.increaseTemp();
        thermostat.displayStatus();
    }
}

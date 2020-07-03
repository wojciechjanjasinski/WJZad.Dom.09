package AirConditioning;

public class AirCondition {
    private double temperature;
    private static final double TEMPERATURE_MODEL = 1;


    public static double getTemperatureModel() {
        return TEMPERATURE_MODEL;
    }

    double AirConditioner(double temperature) {
        double temperatureTwo = temperature - TEMPERATURE_MODEL;
        return temperatureTwo;
    }


    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

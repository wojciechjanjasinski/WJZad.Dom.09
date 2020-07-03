package AirConditioning;

import static AirConditioning.AirCondition.getTemperatureModel;
import static AirConditioning.TestRoomConditions.getTemperatureOne;

public class BasicAirCondition {

    private double temperatureFour;

    public void setTemperatureFour(double temperatureFour) {
        this.temperatureFour = temperatureFour;
    }

    public double getTemperatureFour() {
        return temperatureFour;
    }

    public double AirConditioner() {
        temperatureFour = getTemperatureOne() - (getTemperatureModel() / 10);
        double temperatureFive = temperatureFour--;
        return temperatureFive;


//        System.out.println(neuwTemperature);
//        neuwTemperature -= (getTemperatureModel() / 10);
//        return neuwTemperature;
    }
}

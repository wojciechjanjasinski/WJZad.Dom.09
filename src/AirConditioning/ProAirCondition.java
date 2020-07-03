package AirConditioning;

import static AirConditioning.AirCondition.getTemperatureModel;

public class ProAirCondition {

    double proAirConditioner(double temperature) {
        return temperature - (getTemperatureModel() / 5 );
    }

}

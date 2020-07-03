package AirConditioning;

import static AirConditioning.TestRoomConditions.*;

public class TestRoom {
    public static void main(String[] args) {
        BasicAirCondition basicAirCondition = new BasicAirCondition();
        getTestRoomNumber();
        getRoomOneMetricLength();
        getTemperatureOne();
        getDesiredTemperatureOne();

        while (getTemperatureOne()!= getDesiredTemperatureOne()){
            basicAirCondition.AirConditioner();
            System.out.println(basicAirCondition.getTemperatureFour());
        }
        System.out.println("komunikat");

//        System.out.println(getTemperatureFour());
//        basicAirCondition.AirConditioner(getTemperatureFour());



//        System.out.println(getTemperatureOne());
//        basicAirCondition.AirConditioner(getTemperatureOne());
//        System.out.println(basicAirCondition.AirConditioner(getTemperatureOne()));

//        if (getTemperatureFour() != getDesiredTemperatureOne()){
//            basicAirCondition.AirConditioner(getTemperatureFour());
//            System.out.println("ups");
//        } else
//            System.out.println("osiągnięto pożądaną temperaturę" + getDesiredTemperatureOne());
//    }


    }
}

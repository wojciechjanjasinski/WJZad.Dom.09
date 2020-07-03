package AirConditioning;

public class TestRoomTwo {
    public static void main(String[] args) {
        double desiredTemperatureOne = 22;
        double temperatureTwo = 28; // 32° stopni celsiusza
        double roomOneMetricLength = 14;

        System.out.println(temperatureTwo);
        for (double i = temperatureTwo; i>=desiredTemperatureOne ; i-= 2/roomOneMetricLength) {
            System.out.println(i);
        } // ProAirConditioner
    }
}

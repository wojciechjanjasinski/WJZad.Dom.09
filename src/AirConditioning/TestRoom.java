package AirConditioning;

public class TestRoom {
    public static void main(String[] args) {
        double desiredTemperatureOne = 25;
        double temperatureOne = 32; // 32° stopni celsiusza
        double roomOneMetricLength = 12;

        System.out.println(temperatureOne);
        for (double i = temperatureOne; i>=desiredTemperatureOne ; i-= 1/roomOneMetricLength) {
            System.out.println(i);
        } // basicAirConditioner
    }
}

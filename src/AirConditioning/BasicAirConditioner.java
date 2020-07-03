package AirConditioning;

public class BasicAirConditioner extends AirConditioner {
    public BasicAirConditioner(int roomNumber, double desiredTemperature, double temperatureOfRoom, double roomMetricLength) {
        super(roomNumber, desiredTemperature, temperatureOfRoom, roomMetricLength);
    }

    @Override
    public void startAirConditioner(int room) {
        for (double i = getTemperatureOfRoom(); i >= getDesiredTemperature(); i -= 1 / getRoomMetricLength()) {
            System.out.println(i);
        }
    }

}

package AirConditioning;

public class ProAirConditioner extends AirConditioner {
    public ProAirConditioner(int roomNumber, double desiredTemperature, double temperatureOfRoom, double roomMetricLength) {
        super(roomNumber, desiredTemperature, temperatureOfRoom, roomMetricLength);
    }

    @Override
    public void startAirConditioner(int room) {
        for (double i = getTemperatureOfRoom(); i >= getDesiredTemperature(); i -= 2 / getRoomMetricLength()) {
            System.out.println(i);
        }
    }
}

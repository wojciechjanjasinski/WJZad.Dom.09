package AirConditioning;

public class ProAirConditioner extends AirConditioner {

    public ProAirConditioner(int roomNumber, double temperatureOfRoom, double roomMetricLength, double desiredTemperature) {
        super(roomNumber, temperatureOfRoom, roomMetricLength, desiredTemperature);
    }

    @Override
    public void startAirConditioner(Room room, double desiredTemperature){
        for (double i = getTemperatureOfRoom(); i < getDesiredTemperature(); i -= 2/ getRoomMetricLength()) {
            System.out.println(i);
        }
    }
}

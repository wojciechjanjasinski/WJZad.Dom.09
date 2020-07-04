package AirConditioning;

public class BasicAirConditioner extends AirConditioner {

    public BasicAirConditioner(int roomNumber, double temperatureOfRoom, double roomMetricLength, double desiredTemperature) {
        super(roomNumber, temperatureOfRoom, roomMetricLength, desiredTemperature);
    }

    @Override
    public void startAirConditioner(Room room, double desiredTemperature){
        for (double i = getTemperatureOfRoom(); i < getDesiredTemperature(); i -= 1/ getRoomMetricLength()) {
            System.out.println(i);
        }
    }
}

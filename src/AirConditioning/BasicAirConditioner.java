package AirConditioning;

public class BasicAirConditioner extends AirConditioner {

    public BasicAirConditioner(double desiredTemperature) {
        super(desiredTemperature);
    }

    @Override
    public  void startAirConditioner(Room room){
        for (double i = room.getTemperatureOfRoom(); i >= getDesiredTemperature(); i -= 1 / room.getRoomMetricLength()) {
            System.out.println(i);
            room.setTemperatureOfRoom(i);
        }
    }
}

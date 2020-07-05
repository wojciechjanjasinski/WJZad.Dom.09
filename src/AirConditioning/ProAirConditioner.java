package AirConditioning;

public class ProAirConditioner extends AirConditioner {

    public ProAirConditioner(double desiredTemperature) {
        super(desiredTemperature);
    }
    @Override
    public  void startAirConditioner(Room room){
        for (double i = room.getTemperatureOfRoom(); i >= getDesiredTemperature(); i -= 2 / room.getRoomMetricLength()) {

            System.out.println(i);
        }
    }
    @Override
    public void startAirConditionerOnce (Room room){
        double newTemp = room.getTemperatureOfRoom() - 2/ room.getRoomMetricLength();
        room.setRoomMetricLength(newTemp);
    }
}

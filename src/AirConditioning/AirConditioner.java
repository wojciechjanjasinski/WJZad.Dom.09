package AirConditioning;

public class AirConditioner {
    private double desiredTemperature;

    public AirConditioner(double desiredTemperature) {
        this.desiredTemperature = desiredTemperature;
    }

    public double getDesiredTemperature() {
        return desiredTemperature;
    }

    public void setDesiredTemperature(double desiredTemperature) {
        this.desiredTemperature = desiredTemperature;
    }

    public  void startAirConditioner(Room room){
        for (double i = room.getTemperatureOfRoom(); i >= getDesiredTemperature(); i -= 1 / room.getRoomMetricLength()) {

            System.out.println(i);
        }
    }

    public void startAirConditionerOnce (Room room){
        double newTemp = room.getTemperatureOfRoom() - 1/ room.getRoomMetricLength();
        room.setRoomMetricLength(newTemp);
        System.out.println(newTemp);
    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "desiredTemperature=" + desiredTemperature +
                '}';
    }

    //    public void startAirConditioner(int room) {
//        for (double i = getTemperatureOfRoom(); i >= getDesiredTemperature(); i -= 2 / getRoomMetricLength()) {
//            System.out.println(i);
//        }
//    }

}

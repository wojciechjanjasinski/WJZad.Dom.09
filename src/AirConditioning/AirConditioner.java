package AirConditioning;

public class AirConditioner extends Room {
    private double desiredTemperature;

    public void startAirConditioner(Room room, double desiredTemperature){
        for (double i = getTemperatureOfRoom(); i < getDesiredTemperature(); i -= 1/ getRoomMetricLength()) {
            System.out.println(i);
        }
    }
    public AirConditioner(int roomNumber, double temperatureOfRoom, double roomMetricLength, double desiredTemperature) {
        super(roomNumber, temperatureOfRoom, roomMetricLength);
        this.desiredTemperature = desiredTemperature;
    }

    public double getDesiredTemperature() {
        return desiredTemperature;
    }

    public void setDesiredTemperature(double desiredTemperature) {
        this.desiredTemperature = desiredTemperature;
    }



    @Override
    public String toString() {
        return " Room " + super.toString() + "AirConditioner{" +
                "desiredTemperature=" + desiredTemperature +
                "} ";
    }

    //    public void startAirConditioner(int room) {
//        for (double i = getTemperatureOfRoom(); i >= getDesiredTemperature(); i -= 2 / getRoomMetricLength()) {
//            System.out.println(i);
//        }
//    }

}

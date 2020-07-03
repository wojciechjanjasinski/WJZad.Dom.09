package AirConditioning;

public class AirConditioner {

    private int roomNumber;
    private double desiredTemperature;
    private double temperatureOfRoom;
    private double roomMetricLength;

    public AirConditioner(int roomNumber, double desiredTemperature, double temperatureOfRoom, double roomMetricLength) {
        this.roomNumber = roomNumber;
        this.desiredTemperature = desiredTemperature;
        this.temperatureOfRoom = temperatureOfRoom;
        this.roomMetricLength = roomMetricLength;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getDesiredTemperature() {
        return desiredTemperature;
    }

    public void setDesiredTemperature(double desiredTemperature) {
        this.desiredTemperature = desiredTemperature;
    }

    public double getTemperatureOfRoom() {
        return temperatureOfRoom;
    }

    public void setTemperatureOfRoom(double temperatureOfRoom) {
        this.temperatureOfRoom = temperatureOfRoom;
    }

    public double getRoomMetricLength() {
        return roomMetricLength;
    }

    public void setRoomMetricLength(double roomMetricLength) {
        this.roomMetricLength = roomMetricLength;
    }

    public void startAirConditioner(int room) {
        for (double i = getTemperatureOfRoom(); i >= getDesiredTemperature(); i -= 1 / getRoomMetricLength()) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "roomNumber=" + roomNumber +
                ", desiredTemperature=" + desiredTemperature +
                ", temperatureOfRoom=" + temperatureOfRoom +
                ", roomMetricLength=" + roomMetricLength +
                '}';
    }
}

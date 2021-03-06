package AirConditioning;

public class Room {
    private int roomNumber;
    private double temperatureOfRoom;
    private double roomMetricLength;
    AirConditioner airConditioner;

    public Room(int roomNumber, double temperatureOfRoom, double roomMetricLength) {
        this.roomNumber = roomNumber;
        this.temperatureOfRoom = temperatureOfRoom;
        this.roomMetricLength = roomMetricLength;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
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

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }



    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", temperatureOfRoom=" + temperatureOfRoom +
                ", roomMetricLength=" + roomMetricLength +
                ", airConditioner=" + airConditioner +
                '}';
    }
}

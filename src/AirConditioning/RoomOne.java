package AirConditioning;

public class RoomOne {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner(1, 32, 12, 25);
        System.out.println(airConditioner.toString());
        airConditioner.startAirConditioner(new Room(1, 32, 12), 25);
        System.out.println(airConditioner.toString());

    }
}

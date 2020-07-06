package AirConditioning;

public class RoomOne {
    public static void main(String[] args) {
        AirConditioner airConditioner = new BasicAirConditioner(25);
        Room room = new Room(1, 32, 12);
        System.out.println(room + " " + airConditioner);
        airConditioner.startAirConditioner(room);

        Room roomTwo = new Room(2, 35, 44);
        AirConditioner airConditionerTwo = new ProAirConditioner(30);
        System.out.println(roomTwo + " " + airConditionerTwo);
        airConditionerTwo.startAirConditioner(roomTwo);

        Room roomThree = new Room(3, 33, 25);
        AirConditioner airConditionerThree = new AirConditioner(30);
        System.out.println(roomThree + " " + airConditionerThree);
        airConditioner.startAirConditionerOnce(roomThree);
    }
}

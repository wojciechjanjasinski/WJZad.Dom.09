package AirConditioning;

public class Room {
    public static void main(String[] args) {
        AirConditioner basicAirConditioner = new AirConditioner(2, 25, 32, 12);
        System.out.println(basicAirConditioner.toString());
        basicAirConditioner.startAirConditioner(2);
    }
}

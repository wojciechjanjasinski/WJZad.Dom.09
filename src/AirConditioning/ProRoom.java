package AirConditioning;

public class ProRoom {
    public static void main(String[] args) {
        ProAirConditioner proAirConditioner = new ProAirConditioner(3, 22, 44, 22);
        System.out.println(proAirConditioner.toString());
        proAirConditioner.startAirConditioner(3);
    }
}

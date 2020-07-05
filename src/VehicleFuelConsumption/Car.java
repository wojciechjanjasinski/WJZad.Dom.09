package VehicleFuelConsumption;

public class Car extends Vehicle {


    public Car(String name, String producerName, double petrolTank) {
        super(name, producerName, petrolTank);
    }

    public Car() {
    }

    @Override
    public void airConditionWork() {
        double airConditionWork = getFuelAirConditionUsage() / getDistanceConditionUsage() * getConvertValue();
        System.out.println(airConditionWork);

    }

    @Override
    public void basicVehicleRange(double petrolTank, double fuel, double distanceInKilometre) {
        double resultOfAverageFuelConsumption = fuel / distanceInKilometre * getConvertValue();
        double airConditionWork = getFuelAirConditionUsage() / getDistanceConditionUsage() * getConvertValue();
        double resultOfVehicleRange = (petrolTank / (resultOfAverageFuelConsumption + airConditionWork) * getConvertValue()) * getConvertValue();
        System.out.println(resultOfVehicleRange);

    }

    @Override
    public String toString() {
        return "Car{" +
                "isAirConditionOn=" +
                "} " + super.toString();
    }

    //  public void averageFuelConsumption (double fuel, double distanceInKilometre){
////        double resultOfAverageFuelConsumption = fuel / distanceInKilometre * 100;
////        System.out.println(resultOfAverageFuelConsumption);
////    }
////
////    // 0.8 l na 100 km = fuelAirConditionUsage(9.6) / 1200 * 100
}

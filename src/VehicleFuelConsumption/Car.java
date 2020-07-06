package VehicleFuelConsumption;

public class Car extends Vehicle {


    public Car(String name, String producerName, double petrolTank, double fuel, double distanceInKilometre) {
        super(name, producerName, petrolTank, fuel, distanceInKilometre);
    }

    @Override
    public void airConditionWork() {
        double airConditionWork = getFuelAirConditionUsage() / getDistanceConditionUsage() * getConvertValue();
        System.out.println(airConditionWork);
    }
    @Override
    public void basicVehicleRange() {
        double airConditionWork = getFuelAirConditionUsage() / getDistanceConditionUsage() * getConvertValue();
        double resultOfVehicleRange = (getPetrolTank() / (getAverageFuelConsumption() + airConditionWork) * getConvertValue()) * getConvertValue();
        System.out.println(resultOfVehicleRange);

    }

    @Override
    public String toString() {
        return "Car{} " + super.toString();
    }
}

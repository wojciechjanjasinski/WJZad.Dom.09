package VehicleFuelConsumption;

public class Truck extends Car {
    private final static double TRUCK_DISTANCE_CONDITION_USAGE = 600;
    private final static double CARGO_DISTANCE_CONDITION_USAGE = 1700;
    private final static double CARGO_FUEL_USAGE = 8.5;
    private final static double CARGO_STANDARD_CALCULATE_VALUE = 100;


    public Truck(String name, String producerName, double petrolTank) {
        super(name, producerName, petrolTank);
    }

    public Truck() {
    }

    public static double getTruckDistanceConditionUsage() {
        return TRUCK_DISTANCE_CONDITION_USAGE;
    }

    public static double getCargoDistanceConditionUsage() {
        return CARGO_DISTANCE_CONDITION_USAGE;
    }

    public static double getCargoStandardCalculateValue() {
        return CARGO_STANDARD_CALCULATE_VALUE;
    }

    public static double getCargoFuelUsage() {
        return CARGO_FUEL_USAGE;
    }

    @Override
    public void airConditionWork() {
        double truckAirConditionOn = getFuelAirConditionUsage() / TRUCK_DISTANCE_CONDITION_USAGE * getConvertValue();
        System.out.println(truckAirConditionOn);
    }

    public void cargoFuelAdditionalStandardUsage (){
        double additionalFuelUsage = (getCargoFuelUsage() / getCargoDistanceConditionUsage() * getConvertValue()) * getCargoStandardCalculateValue();
        System.out.println(additionalFuelUsage);
    }
    public void cargoFuelPreciseConsumption (double fuel, double distanceInKilometre, double cargo){
        double resultOfAverageFuelConsumption = fuel / distanceInKilometre * getConvertValue();
        double additionalFuelUsage = (getCargoFuelUsage() / getCargoDistanceConditionUsage() * getConvertValue()) * getCargoStandardCalculateValue();
        double cargoPreciseConsumption = resultOfAverageFuelConsumption + additionalFuelUsage * (cargo/getConvertValue());
        System.out.println(cargoPreciseConsumption);
    }

    public void truckVehicleRange (double petrolTank, double fuel, double distanceInKilometre, double cargo){
        double resultOfAverageFuelConsumption = fuel / distanceInKilometre * getConvertValue();
        double airConditionWork = getFuelAirConditionUsage() / getDistanceConditionUsage() * getConvertValue();
        double additionalFuelUsage = (getCargoFuelUsage() / getCargoDistanceConditionUsage() * getConvertValue()) * getCargoStandardCalculateValue();
        double cargoPreciseConsumption = resultOfAverageFuelConsumption + additionalFuelUsage * (cargo/getConvertValue());
        double resultOfVehicleRange = (petrolTank / (resultOfAverageFuelConsumption + airConditionWork + cargoPreciseConsumption) * getConvertValue()) * getConvertValue();
        System.out.println(resultOfVehicleRange);

    }


    //public void carAirConditionWork (){
    //    double airConditionWork = FUEL_AIR_CONDITION_USAGE / DISTANCE_CONDITION_USAGE * AIR_CONDITION_WORKING;
    //    System.out.println(airConditionWork);

    // 8,5 1700 100
    // }
}

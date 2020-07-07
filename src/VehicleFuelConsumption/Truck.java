package VehicleFuelConsumption;

public class Truck extends Car {
    private double cargo;
    private final static double TRUCK_DISTANCE_CONDITION_USAGE = 600;
    private final static double CARGO_DISTANCE_CONDITION_USAGE = 1700;
    private final static double CARGO_FUEL_USAGE = 8.5;
    private final static double CARGO_STANDARD_CALCULATE_VALUE = 100;

    public Truck(String name, String producerName, double petrolTank, double fuel, double distanceInKilometre, double cargo) {
        super(name, producerName, petrolTank, fuel, distanceInKilometre);
        this.cargo = cargo;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
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
    public double airConditionWork() {
        double airConditionWork = getFuelAirConditionUsage() / TRUCK_DISTANCE_CONDITION_USAGE * getConvertValue();
        System.out.println(airConditionWork);
        return airConditionWork;
    }

    @Override
    public void basicVehicleRange() {
        double additionalFuelUsage = (getCargoFuelUsage() / getCargoDistanceConditionUsage() * getConvertValue()) * getCargoStandardCalculateValue();
        double cargoPreciseConsumption = averageFuelConsumption() + additionalFuelUsage * (getCargo()/getConvertValue());
        double resultOfVehicleRange = (getPetrolTank() / (averageFuelConsumption() + airConditionWork() + cargoPreciseConsumption) * getConvertValue()) * getConvertValue();
        System.out.println(resultOfVehicleRange);

    }

    @Override
    public String toString() {
        return "Truck{" +
                "cargo=" + cargo +
                "} " + super.toString();
    }
}

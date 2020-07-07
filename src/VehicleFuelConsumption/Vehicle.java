package VehicleFuelConsumption;

public class Vehicle {
    private String name;
    private String producerName;
    private double petrolTank; // in metric system litre
    private double fuel; // in metric system litre
    private double distanceInKilometre; // in metric system litre
    private final static double CONVERT_VALUE = 100;
    private final static double FUEL_AIR_CONDITION_USAGE = 9.6;
    private final static double DISTANCE_CONDITION_USAGE = 1200;


    public Vehicle(String name, String producerName, double petrolTank, double fuel, double distanceInKilometre) {
        this.name = name;
        this.producerName = producerName;
        this.petrolTank = petrolTank;
        this.fuel = fuel;
        this.distanceInKilometre = distanceInKilometre;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public double getPetrolTank() {
        return petrolTank;
    }

    public void setPetrolTank(double petrolTank) {
        this.petrolTank = petrolTank;
    }

    public static double getConvertValue() {
        return CONVERT_VALUE;
    }

    public static double getFuelAirConditionUsage() {
        return FUEL_AIR_CONDITION_USAGE;
    }

    public static double getDistanceConditionUsage() {
        return DISTANCE_CONDITION_USAGE;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getDistanceInKilometre() {
        return distanceInKilometre;
    }

    public void setDistanceInKilometre(double distanceInKilometre) {
        this.distanceInKilometre = distanceInKilometre;
    }

    public void airConditionWork() {
        double airConditionWork = FUEL_AIR_CONDITION_USAGE / DISTANCE_CONDITION_USAGE * getConvertValue();
        System.out.println(airConditionWork);
    }

    public double averageFuelConsumption() {
        double resultOfAverageFuelConsumption = getFuel() / getDistanceInKilometre() * getConvertValue();
        System.out.println(resultOfAverageFuelConsumption);
        return resultOfAverageFuelConsumption;
    }


    // 0.8 l na 100 km = fuelAirConditionUsage(9.6) / 1200 * 100

    public void basicVehicleRange() {
        double resultOfVehicleRange = (getPetrolTank() / averageFuelConsumption() * getConvertValue()) * getConvertValue();
        System.out.println(resultOfVehicleRange);

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", producerName='" + producerName + '\'' +
                ", petrolTank=" + petrolTank +
                ", fuel=" + fuel +
                ", distanceInKilometre=" + distanceInKilometre +
                '}';
    }
}

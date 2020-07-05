package VehicleFuelConsumption;

public class Vehicle {
    private String name;
    private String producerName;
    private double petrolTank; // in metric system litre
    private final static double CONVERT_VALUE = 100;
    private final static double FUEL_AIR_CONDITION_USAGE = 9.6;
    private final static double DISTANCE_CONDITION_USAGE = 1200;


    public Vehicle(String name, String producerName, double petrolTank) {
        this.name = name;
        this.producerName = producerName;
        this.petrolTank = petrolTank;
    }

    public Vehicle() {
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

    public void airConditionWork() {
        double airConditionWork = FUEL_AIR_CONDITION_USAGE / DISTANCE_CONDITION_USAGE * getConvertValue();
        System.out.println(airConditionWork);
    }

    public void averageFuelConsumption(double fuel, double distanceInKilometre) {
        double resultOfAverageFuelConsumption = fuel / distanceInKilometre * getConvertValue();
        System.out.println(resultOfAverageFuelConsumption);
    }


    // 0.8 l na 100 km = fuelAirConditionUsage(9.6) / 1200 * 100

    public void basicVehicleRange(double petrolTank, double fuel, double distanceInKilometre) {
        double resultOfAverageFuelConsumption = fuel / distanceInKilometre * getConvertValue();
        double resultOfVehicleRange = (petrolTank / resultOfAverageFuelConsumption * getConvertValue()) * getConvertValue();
        System.out.println(resultOfVehicleRange);

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", producerName='" + producerName + '\'' +
                ", petrolTank=" + petrolTank +
                '}';
    }
}

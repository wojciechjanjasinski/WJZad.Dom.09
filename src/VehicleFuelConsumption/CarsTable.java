package VehicleFuelConsumption;

public class CarsTable {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("kaktus", "Peugeott", 58);
        vehicles[1] = new Car("pugatti", "fejron", 40);
        vehicles[2] = new Truck("FX-500", "Zkania", 400);
        vehicles[3] = new Truck("ZFV-1000", "Namm", 600);

        for (Vehicle vehiclesTable: vehicles){
            System.out.println(vehiclesTable);
            vehiclesTable.averageFuelConsumption(20, 200);
            vehiclesTable.basicVehicleRange(20, 20, 200);
        }
        for (Vehicle vehiclesTable: vehicles){
            vehiclesTable.airConditionWork();
            vehiclesTable.basicVehicleRange(20, 20, 200);
            System.out.println(vehiclesTable);
        }

    }
}

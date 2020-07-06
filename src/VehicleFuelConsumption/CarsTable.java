package VehicleFuelConsumption;

public class CarsTable {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("kaktus", "Peugeott", 58, 40, 200);
        vehicles[1] = new Car("pugatti", "fejron", 40, 30, 400);
        vehicles[2] = new Truck("FX-500", "Zkania", 400, 395, 1000, 450);
        vehicles[3] = new Truck("ZFV-1000", "Namm", 600, 550, 900, 700);

        for (Vehicle vehiclesTable: vehicles){
            System.out.println(vehiclesTable);
            vehiclesTable.averageFuelConsumption();
            vehiclesTable.basicVehicleRange();
        }
        for (Vehicle vehiclesTable: vehicles){
            vehiclesTable.airConditionWork();
            vehiclesTable.basicVehicleRange();
            System.out.println(vehiclesTable);
        }

    }
}

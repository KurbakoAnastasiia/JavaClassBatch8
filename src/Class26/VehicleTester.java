package Class26;

public class VehicleTester {
    public static void main(String[] args) {

        Vehicle tesla = new Tesla("Red", "Y", "Tesla");
        tesla.start();
        tesla.drive();
        tesla.brake();
        tesla.stop();

        System.out.println("Number of vehicles created  " + Vehicle.totalVehicle);

        new Toyota("Yellow", "Camry", "Toyta");
        System.out.println("Number of vehicles created  " + Vehicle.totalVehicle);
    }
}

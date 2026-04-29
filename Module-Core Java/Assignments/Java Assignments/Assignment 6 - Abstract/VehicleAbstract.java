
abstract class Vehicle {

    int vehicleNo, NoOfWheels;
    String model, cName;
    double price;

    public Vehicle() {
        this.vehicleNo = 00;
        this.cName = "Not Given";
        this.NoOfWheels = 00;
        this.price = 00;
        this.model = "Not Given";
    }

    public Vehicle(int vehicleNo, int NoOfWheels, String model, String cName, double price) {
        this.vehicleNo = vehicleNo;
        this.NoOfWheels = NoOfWheels;
        this.model = model;
        this.cName = cName;
        this.price = price;
    }

    void setVehicleNo(int vNo) {
        this.vehicleNo = vNo;
    }

    void setNoOfWheels(int wheels) {
        this.NoOfWheels = wheels;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setCname(String cName) {
        this.cName = cName;
    }

    int getVehicleNo() {
        return this.vehicleNo;
    }

    int getNoOfWheels() {
        return this.NoOfWheels;
    }

    String getModel() {
        return this.model;
    }

    double getPrice() {
        return this.price;
    }

    String getCname() {
        return this.cName;
    }

    abstract void display();
}

class Bike extends Vehicle {

    int noOfStands, noOfHelmets;
    String bikeCategory;

    public Bike() {
        super();
        this.noOfHelmets = 00;
        this.noOfStands = 00;
        this.bikeCategory = "Not Given";
    }

    public Bike(int vehicleNo, int NoOfWheels, String model, String cName, double price, int noOfStands, int noOfHelmets, String Category) {
        super(vehicleNo, NoOfWheels, model, cName, price);
        this.noOfStands = noOfStands;
        this.noOfHelmets = noOfHelmets;
        this.bikeCategory = Category;
    }

    void setStands(int noOfStands) {
        this.noOfStands = noOfStands;
    }

    void setHelmets(int noOfHelmets) {
        this.noOfHelmets = noOfHelmets;
    }

    void setCategory(String Category) {
        this.bikeCategory = Category;
    }

    int getStands() {
        return this.noOfStands;
    }

    int getHelmets() {
        return this.noOfHelmets;
    }

    String getCategory() {
        return this.bikeCategory;
    }

    void display() {
        System.out.println("Vehicle Numbers: " + vehicleNo);
        System.out.println("Number of wheels: " + NoOfWheels);
        System.out.println("Model: " + model);
        System.out.println("Company Name: " + cName);
        System.out.println("Price: " + price);
        System.out.println("No Of Stands: " + noOfStands);
        System.out.println("No Of Helmets: " + noOfHelmets);
        System.out.println("Category: " + bikeCategory);
    }

}

class Car extends Vehicle {

    String hasPowerSteering, driveMode, parkingAssistSensors;

    public Car() {
        super();
        this.hasPowerSteering = "Not Given";
        this.driveMode = "Not Given";
        this.parkingAssistSensors = "Not Given";
    }

    public Car(int vehicleNo, int NoOfWheels, String model, String cName, double price, String hasPowerSteering, String driveMode, String parkingAssistSensors) {
        super(vehicleNo, NoOfWheels, model, cName, price);
        this.hasPowerSteering = hasPowerSteering;
        this.driveMode = driveMode;
        this.parkingAssistSensors = parkingAssistSensors;
    }

    void setPowerSteering(String hasPowerSteering) {
        this.hasPowerSteering = hasPowerSteering;
    }

    void setDriveMode(String driveMode) {
        this.driveMode = driveMode;
    }

    void setParkingAssistSensor(String AssistSensor) {
        this.parkingAssistSensors = AssistSensor;
    }

    String getPowerSteering() {
        return this.hasPowerSteering;
    }

    String getDriveMode() {
        return this.driveMode;
    }

    String getParkingAssistSensor() {
        return this.parkingAssistSensors;
    }

    void display() {
        System.out.println("Vehicle Numbers: " + vehicleNo);
        System.out.println("Number of wheels: " + NoOfWheels);
        System.out.println("Model: " + model);
        System.out.println("Company Name: " + cName);
        System.out.println("Price: " + price);
        System.out.println("Power Steering: " + hasPowerSteering);
        System.out.println("Drive Mode: " + driveMode);
        System.out.println("Parking Assistor: " + parkingAssistSensors);
    }
}

class Bus extends Vehicle {

    int passengerCapacity, standingCapacity;

    public Bus() {
        super();
        this.passengerCapacity = 00;
        this.standingCapacity = 00;
    }

    public Bus(int vehicleNo, int NoOfWheels, String model, String cName, double price, int passengerCapacity, int standingCapacity) {
        super(vehicleNo, NoOfWheels, model, cName, price);
        this.passengerCapacity = passengerCapacity;
        this.standingCapacity = standingCapacity;
    }

    void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    void setStandingCapacity(int standingCapacity) {
        this.standingCapacity = standingCapacity;
    }

    int getPassengerCapacity() {
        return this.passengerCapacity;
    }

    int getStandingCapacity() {
        return this.standingCapacity;
    }

    void display() {
        System.out.println("Vehicle Numbers: " + vehicleNo);
        System.out.println("Number of wheels: " + NoOfWheels);
        System.out.println("Model: " + model);
        System.out.println("Company Name: " + cName);
        System.out.println("Price: " + price);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Standing Capacity: " + standingCapacity);
    }
}

public class VehicleAbstract {

    public static void main(String[] args) {
        Vehicle v;

        v = new Bike(1, 2, "xyz", "Bajaj", 40000, 1, 2, "abc");
        v.display();

        System.out.println("");

        v = new Car(2, 4, "pqr", "Maruti 800", 80000, "Yes", "No", "No");
        v.display();

        System.out.println("");

        v = new Bus(3, 4, "uvw", "jkl", 100000, 50, 10);
        v.display();
    }
}

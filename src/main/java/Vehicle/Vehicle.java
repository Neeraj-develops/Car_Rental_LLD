package Vehicle;

import Emuns.VehicleStatus;
import Emuns.VehicleType;

public abstract class Vehicle {
    private String registrationNumber;
    private String model;
    private VehicleType type;
    private VehicleStatus status;
    private double baseRentalPrice;

    public Vehicle(String registrationNumber, String model, VehicleType type, double baseRentalPrice){
        this.baseRentalPrice = baseRentalPrice;
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.type= type;
        this.status = VehicleStatus.AVAILABLE;
    }
    public  abstract double calculateRentalFee(int days);

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public double getBaseRentalPrice() {
        return baseRentalPrice;
    }
}

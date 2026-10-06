package Vehicle;

import Emuns.VehicleType;

public class SuvVehicle extends Vehicle{
    private static final double RATE_MULTI = 1.5;

    public SuvVehicle(String registrationNumber, String model, double baseRentalPrice){
        super(registrationNumber, model, VehicleType.SUV, baseRentalPrice);
    }


    @Override
    public double calculateRentalFee(int days) {
        return getBaseRentalPrice() * days * RATE_MULTI;
    }
}

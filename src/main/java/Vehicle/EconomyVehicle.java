package Vehicle;

import Emuns.VehicleType;

public class EconomyVehicle extends Vehicle{
    private static final double RATE_MULTI = 1.0;

    public EconomyVehicle(String registrationNumber, String model, double baseRentalPrice){
        super(registrationNumber, model, VehicleType.ECONOMY, baseRentalPrice);
    }


    @Override
    public double calculateRentalFee(int days) {
        return getBaseRentalPrice() * days * RATE_MULTI;
    }
}

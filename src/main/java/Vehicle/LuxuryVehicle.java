package Vehicle;

import Emuns.VehicleType;

public class LuxuryVehicle extends Vehicle{
    private static final double RATE_MULTI = 2.5;
    private static final double PREMIUM_FEE = 50;

    public LuxuryVehicle(String registrationNumber, String model, double baseRentalPrice){
        super(registrationNumber, model, VehicleType.LUXURY, baseRentalPrice);
    }


    @Override
    public double calculateRentalFee(int days) {
        return (getBaseRentalPrice() * days * RATE_MULTI)+ PREMIUM_FEE;
    }
}

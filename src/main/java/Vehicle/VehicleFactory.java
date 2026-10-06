package Vehicle;

import Emuns.VehicleType;

public class VehicleFactory {
    public  static Vehicle vehicleFactory(String registrationNumber, VehicleType type,
                                          String model, double baseRentalPrice){
        return switch (type) {
            case ECONOMY -> new EconomyVehicle(registrationNumber, model, baseRentalPrice);
            case LUXURY -> new LuxuryVehicle(registrationNumber, model, baseRentalPrice);
            case SUV -> new SuvVehicle(registrationNumber, model, baseRentalPrice);
            default -> throw new IllegalArgumentException("Unsupported vehicle type");
        };
    }
}

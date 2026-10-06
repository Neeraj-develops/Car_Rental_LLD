package Store;

import Vehicle.Vehicle;

import java.util.Date;
import java.util.List;
import java.util.Map;

public abstract class RentalStore {
    private int id;
    private String name;
    private Location location;
    private Map<String, Vehicle> vehicls;

    public abstract List<Vehicle> getAvailableVehicles(Date startDate, Date endDate);
    public abstract void addVehicle(Vehicle vehicle);
    public abstract void removeVehicle(Vehicle vehicle);
    public abstract boolean isVehicleAvailable(String registrationNumber, Date startDate, Date endDate);
}

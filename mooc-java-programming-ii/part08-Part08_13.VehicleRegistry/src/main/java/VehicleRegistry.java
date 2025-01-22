
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.vehicleRegistry.get(licensePlate) == null) {
            this.vehicleRegistry.put(licensePlate, owner);
            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate) {
        return this.vehicleRegistry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.vehicleRegistry.get(licensePlate) == null) {
            return false;
        }

        this.vehicleRegistry.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.vehicleRegistry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<>();
        for (String owner : this.vehicleRegistry.values()) {
            if (ownerList.contains(owner)) {
                continue;
            }
            ownerList.add(owner);
            System.out.println(owner);
        }
    }


}

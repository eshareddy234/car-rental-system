package service;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class CarRentalSystem {

    private List<Vehicle> vehicles = new ArrayList<>();

    public void loadDefaultCars() {
        vehicles.add(new Car("C1", "Toyota", "Innova", 2000));
        vehicles.add(new Car("C2", "Honda", "City", 1800));
        vehicles.add(new Car("C3", "Hyundai", "Creta", 2200));
        vehicles.add(new LuxuryCar("L1", "BMW", "X5", 6000));
        vehicles.add(new LuxuryCar("L2", "Audi", "A6", 5000));
    }

    public void showAvailableVehicles() {
        System.out.println("\n--- Available Cars ---");
        boolean found = false;
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                System.out.println(v.getId() + " - " + v.getBrand() + " " + v.getModel());
                found = true;
            }
        }
        if (!found) System.out.println("No cars available.");
    }

    public Vehicle findVehicleById(String id) {
        for (Vehicle v : vehicles) {
            if (v.getId().equalsIgnoreCase(id)) {
                return v;
            }
        }
        return null;
    }

    public void returnCar(String id) {
        Vehicle v = findVehicleById(id);
        if (v != null && !v.isAvailable()) {
            v.setAvailable(true);
            System.out.println("✅ Car returned successfully.");
        } else {
            System.out.println("❌ Invalid car ID or car already available.");
        }
    }
}

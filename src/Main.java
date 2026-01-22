import model.Car;
import service.CarRentalSystem;

public class Main {
    public static void main(String[] args) {

        CarRentalSystem system = new CarRentalSystem();

        // Pre-loaded data (demo data)
        system.addCar(new Car("C1", "Toyota", "Camry", 10000));
        system.addCar(new Car("C2", "Honda", "City", 12000));
        system.addCar(new Car("C3", "Mahindra", "Thar", 20000));
        system.addCar(new Car("C4", "Hyundai", "Creta", 15000));

        // Start application
        system.menu();
    }
}

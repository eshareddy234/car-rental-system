package service;

import model.*;
import java.util.*;

public class CarRentalSystem {

    private List<Car> cars = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();

    // Add car to system
    public void addCar(Car car) {
        cars.add(car);
    }

    // Main menu
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== CAR RENTAL SYSTEM =====");
            System.out.println("1. Rent Car");
            System.out.println("2. Return Car");
            System.out.println("3. Show All Cars");
            System.out.println("4. Show All Rentals");
            System.out.println("5. Total Revenue");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    rentCarFlow(sc);
                    break;
                case 2:
                    returnCarFlow(sc);
                    break;
                case 3:
                    showAllCars();
                    break;
                case 4:
                    showAllRentals();
                    break;
                case 5:
                    showTotalRevenue();
                    break;
                case 6:
                    System.out.println("Thank you for using system!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }

    // Rent flow
    private void rentCarFlow(Scanner sc) {
        System.out.print("\nEnter customer name: ");
        String name = sc.nextLine();

        System.out.println("\nAvailable Cars:");
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car.getCarId() + " - " + car.getBrand() + " " + car.getModel() + " - Rent/day: " + car.getPricePerDay());
            }
        }

        System.out.print("\nEnter Car ID: ");
        String carId = sc.nextLine();

        System.out.print("Enter rental days: ");
        int days = sc.nextInt();
        sc.nextLine();

        Car selectedCar = findCar(carId);

        if (selectedCar != null && selectedCar.isAvailable()) {
            Customer customer = new Customer("CUS" + (customers.size() + 1), name);
            customers.add(customer);

            double price = selectedCar.calculatePrice(days);

            System.out.println("\nTotal price: ₹" + price);
            System.out.print("Confirm rental (Y/N): ");
            String confirm = sc.nextLine();

            if (confirm.equalsIgnoreCase("Y")) {
                selectedCar.rent();
                rentals.add(new Rental(selectedCar, customer, days));
                System.out.println("Car rented successfully!");
            } else {
                System.out.println("Rental cancelled.");
            }
        } else {
            System.out.println("Invalid car or not available.");
        }
    }

    // Return flow
    private void returnCarFlow(Scanner sc) {
        System.out.print("\nEnter Car ID to return: ");
        String carId = sc.nextLine();

        Car car = findCar(carId);

        if (car != null && !car.isAvailable()) {
            car.returnCar();
            rentals.removeIf(r -> r.getCar() == car);
            System.out.println("Car returned successfully!");
        } else {
            System.out.println("Car not found or already available.");
        }
    }

    // Reports
    public void showAllCars() {
        System.out.println("\n--- ALL CARS REPORT ---");
        for (Car car : cars) {
            System.out.println(
                    car.getCarId() + " | " +
                            car.getBrand() + " | " +
                            car.getModel() + " | " +
                            (car.isAvailable() ? "Available" : "Rented")
            );
        }
    }

    public void showAllRentals() {
        System.out.println("\n--- RENTAL REPORT ---");
        if (rentals.isEmpty()) {
            System.out.println("No active rentals.");
        }
        for (Rental r : rentals) {
            System.out.println(
                    r.getCustomer().getName() +
                            " rented " +
                            r.getCar().getBrand() +
                            " for " +
                            r.getDays() +
                            " days"
            );
        }
    }

    public void showTotalRevenue() {
        double total = 0;
        for (Rental r : rentals) {
            total += r.getCar().calculatePrice(r.getDays());
        }
        System.out.println("\nTotal Revenue: ₹" + total);
    }

    // Helper method
    private Car findCar(String id) {
        for (Car car : cars) {
            if (car.getCarId().equalsIgnoreCase(id)) {
                return car;
            }
        }
        return null;
    }
}

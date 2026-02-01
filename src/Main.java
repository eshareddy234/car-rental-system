import model.*;
import service.CarRentalSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CarRentalSystem system = new CarRentalSystem();
        system.loadDefaultCars();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== 🚗 Car Rental System ======");
            System.out.println("1. View Available Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    system.showAvailableVehicles();
                    break;

                case 2:
                    system.showAvailableVehicles();
                    System.out.print("Enter Vehicle ID: ");
                    String vid = sc.nextLine();

                    Vehicle selected = system.findVehicleById(vid);

                    if (selected == null || !selected.isAvailable()) {
                        System.out.println("❌ Car not available.");
                        break;
                    }

                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();

                    selected.setAvailable(false);
                    Customer customer = new Customer(name, "CU01");

                    Rental rental = new Rental(selected, customer, days);
                    rental.showBill();
                    break;

                case 3:
                    System.out.print("Enter Vehicle ID to return: ");
                    String rid = sc.nextLine();
                    system.returnCar(rid);
                    break;

                case 4:
                    System.out.println("====== 👋 Thank you! ======");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}

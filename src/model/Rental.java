package model;

public class Rental {
    private Vehicle vehicle;   // Polymorphism
    private Customer customer;
    private int days;

    public Rental(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
    }

    public void showBill() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Vehicle: " + vehicle.getBrand() + " " + vehicle.getModel());
        System.out.println("Days: " + days);
        System.out.println("Price per day: " + vehicle.basePricePerDay);
        System.out.println("Total Price: ₹" + vehicle.calculatePrice(days));
    }
}

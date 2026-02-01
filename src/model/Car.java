package model;

public class Car extends Vehicle {

    public Car(String id, String brand, String model, double basePricePerDay) {
        super(id, brand, model, basePricePerDay);
    }

    @Override
    public double calculatePrice(int days) {
        return basePricePerDay * days;
    }
}

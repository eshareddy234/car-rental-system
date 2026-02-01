package model;

public class LuxuryCar extends Vehicle {

    public LuxuryCar(String id, String brand, String model, double basePricePerDay) {
        super(id, brand, model, basePricePerDay);
    }

    @Override
    public double calculatePrice(int days) {
        return (basePricePerDay * days);
    }
}

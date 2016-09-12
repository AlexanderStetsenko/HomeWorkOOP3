package com.company;

/**
 * Created by Александр on 12.09.2016.
 */
public class Truck extends Car
{
    double weight;

    public Truck(double cost, String name, double weight) {
        super(cost, name);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nTruck Car \n" +
                "Weight: " + weight +
                "\nCar Cost " + super.getCost() + "\n";

    }
}
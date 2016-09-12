package com.company;

/**
 * Created by Александр on 12.09.2016.
 */
public class WomanCar extends Car
{
    int countOfAccident;

    public WomanCar(double cost, String name, int countOfAccident) {
        super(cost, name);
        this.countOfAccident = countOfAccident;
    }

    @Override
    public String toString() {
        return "\nWoman Car \n" +
                "Count Of Accident: " + countOfAccident +
                "\nCar Cost " + super.getCost()+ "\n";
    }
}
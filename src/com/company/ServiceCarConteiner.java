package com.company;

import java.util.Arrays;

/**
 * Created by Александр on 12.09.2016.
 */
public class ServiceCarConteiner
{
    private Car[] carList = new Car[Car.count];


    public Car[] getCarList() {
        return carList;
    }

    public void addToCarList(Car car)
    {
        carList[car.getId()] = car;
    }

    public Car getCarById(int id)
    {
        return carList[id];
    } // Id is equal to index of Cars Array

    public double averageCost() // Use static fields from Car Class
    {
        System.out.println("\nAvarage cost is: ");
        return Car.costSum / Car.count;
    }

    public Car[] sorByCost ( ) // Sort by cost use booble sort
    {
        Car[] sortCarList = carList;

        for (int i = 0; i < sortCarList.length; i++)
        {
            for (int j = 1; j < sortCarList.length - i; j++)
//                for (int i = 0; i < n; i++) {
//                    for (int j = 1; j < (n - i); j++)
            {
                Car tmp;
                if (sortCarList[j - 1].getCost() > sortCarList[j].getCost())
                {
                    tmp = sortCarList[j - 1];
                    sortCarList[j - 1] = sortCarList[j];
                    sortCarList[j] =  tmp;
                }
            }
        }


        return sortCarList;
    }


}
package com.company;

/**
 * Created by Александр on 12.09.2016.
 */
public abstract class Car {

    private double cost;
    private String name;
    private int id;

    public Car(int id) {
        this.id = id;
    }

    public static int count;
    public static double costSum;



    public Car() {
    }

    public Car(double cost, String name) {
        this.cost = cost;
        this.name = name;
        id = count;
        count++;
        costSum += cost;
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public abstract String toString();






}
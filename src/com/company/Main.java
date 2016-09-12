package com.company;

import javax.xml.ws.Service;
import java.sql.Array;
import java.util.Arrays;

public class Main {
//1. Создать 3 класса, описывающие 2 типа некоего товара. Один из классов – базовый,
// второй и третий – описывают типы товаров. В первом – обязательны поля «цена» и «название». В наследниках должны быть объявлены новые поля.
//
//1.1. В классах должны быть два конструктора: пустой и параметризованный, методы get set для каждого поля, метод public String toString(),
// возвращающий строковое представление объекта.
//
//1.2. Базовый класс должен быть абстрактным.
//
//1.3. При помощи статических полей и метода найти и отпечатать среднюю цену товара.
//
//2. Создать контейнер для хранения товаров. В нем должны быть реализованы методы Add, Count, метод доступа по индексу, сортировки по цене и печати содержимого.
//
//3. Заполнить контейнер, распечатать, отсортировать, распечатать.

    public static void main(String[] args)
    {
        Car truck1 = new Truck(44.66, "Truck", 12);
        Car womanCar1 = new WomanCar(22.44, "Woman", 4);
        Car truck3 = new Truck(44.66, "Truck1", 24);
        Car womanCar2 = new WomanCar(2223.44, "Woman", 6);

        ServiceCarConteiner serviceCarConteiner = new ServiceCarConteiner();

        serviceCarConteiner.addToCarList(truck1);
        serviceCarConteiner.addToCarList(womanCar1);
        serviceCarConteiner.addToCarList(truck3);
        serviceCarConteiner.addToCarList(womanCar2);


        System.out.println("===Get Cars Array==="+ Arrays.toString(serviceCarConteiner.getCarList()).replace("]", " ").replace(",", "").replace("[", ""));
        System.out.println("===Get avarage cost===\n" + serviceCarConteiner.averageCost());
        System.out.println("\n===Get car by Id===" + serviceCarConteiner.getCarById(1));
        System.out.println("===Sorted by cost==="+ Arrays.toString(serviceCarConteiner.sorByCost()).replace("]", " ").replace(",", "").replace("[", ""));
    }
}
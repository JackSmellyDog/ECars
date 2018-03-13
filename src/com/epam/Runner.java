package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Car car1 = new Car(1, "bmw", "x5", 2003, "black", 82000, "XS123456789");
        Car car2 = new Car(2, "bmw", "x5 m", 2009, "red", 90000, "XS123456790");
        Car car3 = new Car(3, "bmw", "x6", 2008, "yellow", 88000, "XS123456791");
        Car car4 = new Car(4, "bmw", "x6 m", 2009, "white", 92000, "XS123456792");
        Car car5 = new Car(5, "ford", "c-max", 2011, "black", 18000, "XS123456781");
        Car car6 = new Car(6, "ford", "b-max", 2013, "red", 20000, "XS123456782");
        Car car7 = new Car(7, "ford", "kuga", 2008, "yellow", 28000, "XS123456783");
        Car car8 = new Car(8, "ford", "fiesta", 2005, "white", 25000, "XS123456784");
        Car car9 = new Car(9, "ford", "kuga", 2009, "yellow", 30000, "XS123456785");
        Car car10 = new Car(10, "ford", "kuga", 2009, "yellow", 25000, "XS123456787");

        List<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        System.out.println(cars);

//        System.out.println(CarLogic.getCarsByBrand(cars, "bmw"));
//        System.out.println(CarLogic.getCarsByModel(cars, "kuga"));
//        System.out.println(CarLogic.getCarsByYear(cars, 10));
    }

}

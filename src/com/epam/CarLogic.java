package com.epam;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CarLogic {
    public static List<Car> getCarsByBrand(List<Car> cars, String brand) {
        List<Car> result = new ArrayList<>();
        if (brand == null) {
            return result;
        }

        for (Car car : cars) {
            if (brand.equalsIgnoreCase(car.getBrand())) {
                result.add(car);
            }
        }
        return result;
    }

    public static List<Car> getCarsByModel(List<Car> cars, String model, int n) {

        List<Car> result = new ArrayList<>();
        if (model == null) {
            return result;
        }

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        for (Car car : cars) {
            if (model.equalsIgnoreCase(car.getModel()) && currentYear - car.getDate() > n) {
                result.add(car);
            }
        }
        return result;
    }

    public static List<Car> getCarsByYear(List<Car> cars, int year, double price) {
        List<Car> result = new ArrayList<>();

        for (Car car : cars) {
            if (car.getDate() == year && car.getPrice() > price) {
                result.add(car);
            }
        }
        return result;
    }

}

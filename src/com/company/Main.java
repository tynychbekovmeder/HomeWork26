package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Car, Car1>car=new HashMap<>();
        car.put(new Car("0107", "1801"), new Car1(2020, "GT-63s", "200 тыс.", "Туманный цвет"));

        for (Map.Entry iterate: car.entrySet()){
            System.out.println("Ключ машины: "+iterate.getKey());
            System.out.println();
            System.out.println("Данные машины: "+iterate.getValue());
        }
    }
}

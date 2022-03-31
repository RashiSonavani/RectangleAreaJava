package com.company;

public class Cars_Model {

    public static void main(String[] args) {

        Car car_1 = new Car("Urus", "Lamborghini", 2019, 200000, "White", 4);

        System.out.println(car_1.toString());

        car_1.sell(2);

        car_1.delivery(3);

        //*****//

        Car car_2 = new Car("Aventador", "Lamborghini", 2020, 150000, "Blue", 7);

        System.out.println(car_2.toString());

        car_2.sell(4);

        car_2.delivery(3);

        //*****//

        Car car_3 = new Car("Huracan", "Lamborghini", 2018, 100000, "Yellow", 10);

        System.out.println(car_3.toString());

        car_3.sell(5);

        car_3.delivery(5);
    }
}

package org.example;

import org.example.builder.House;

public class Main {
    public static void main(String[] args) {
        House house = new House.Builder()
                .numFloor(3)
                .pool(true)
                .roof("tuiles")
                .color("black")
                .build();

        System.out.println(house);
    }
}

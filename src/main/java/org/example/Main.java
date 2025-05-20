package org.example;

public class Main {
    public static void main(String[] args) {


        House houser = new House.Builder().numFloor(3).pool(true).roof("brique").color("black").build();
        System.out.println(houser);
    }
}
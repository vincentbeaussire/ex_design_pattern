package org.example.FactoryMethod;

public class Main {
    public static void main(String[] args) {

        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createSound();
        dog.aboyer();

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createSound();
        cat.miauler();
    }
}

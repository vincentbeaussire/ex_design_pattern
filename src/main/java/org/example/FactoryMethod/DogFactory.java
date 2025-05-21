package org.example.FactoryMethod;

public class DogFactory extends AnimalFactory {

    @Override
    public Animal createSound() {
        return new Dog();
    }
}

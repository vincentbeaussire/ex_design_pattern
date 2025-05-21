package org.example.FactoryMethod;

public class CatFactory extends AnimalFactory {
    @Override
    public Animal createSound() {
        return new Cat();
    }
}

package org.example.structural.decorator;

public class PlainText implements Text{

    @Override
    public String getTransform() {
        return "Bonjour,";
    }
}

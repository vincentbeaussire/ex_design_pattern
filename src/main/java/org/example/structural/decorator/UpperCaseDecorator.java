package org.example.structural.decorator;

public class UpperCaseDecorator extends TextDecorator {

    public UpperCaseDecorator(Text text) {
        super(text);
    }

    @Override
    public String getTransform() {
        return super.getTransform().toUpperCase() + " TOUT LE MONDE";
    }
}

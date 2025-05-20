package org.example.structural.decorator;

public class AddColor extends TextDecorator {
    public AddColor(Text text) {
        super(text);
    }

    @Override
    public String getTransform() {
        return super.getTransform() + " tout le monde ";
    }
}

package org.example.structural.decorator;

public class LowerCaseDecorator extends TextDecorator {
    public LowerCaseDecorator(Text text) {
        super(text);
    }

    @Override
    public String getTransform() {
        return super.getTransform().toLowerCase() + " tout le monde";
    }
}

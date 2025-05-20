package org.example.structural.decorator;

public class AddPrefixDecorator extends TextDecorator {
    public AddPrefixDecorator(Text text) {
        super(text);
    }

    @Override
    public String getTransform() {
        return super.getTransform() + " tout le monde  ";
    }
}

package org.example.structural.decorator;

public abstract class TextDecorator implements Text {

    protected Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String getTransform() {
        return text.getTransform();
    }
}

package org.example.structural.decorator;

public class Main {
    public static void main(String[] args) {

        Text plainText = new PlainText();
        System.out.println(plainText.getTransform() + " ");

        Text addPrefix = new AddPrefixDecorator(plainText);
        System.out.println(addPrefix.getTransform() + " ");

        Text upperCase = new UpperCaseDecorator(plainText);
        System.out.println(upperCase.getTransform() + " ");

        Text lowerCase = new LowerCaseDecorator(plainText);
        System.out.println(lowerCase.getTransform() + " ");

        Text addColor = new AddColor(plainText);
        System.out.println("\u001B[92m" + addColor.getTransform() +  " ");

    }
}

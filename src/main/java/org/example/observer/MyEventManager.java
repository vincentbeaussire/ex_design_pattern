package org.example.observer;

public class MyEventManager implements NotifyEvent {

    private String name;

    public MyEventManager(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Next event :  " + message);
    }
}

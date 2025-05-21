package org.example.observer;

import com.sun.jdi.event.ExceptionEvent;

public class Main {
    public static void main(String[] args) {

        EventManager eventManager = new EventManager();

        NotifyEvent notifyEvent1 = new MyEventManager("event manager 1");
        eventManager.addNotfifyEvent(notifyEvent1);
        eventManager.notifyNotifyEvent("Meeting with the team.");

        NotifyEvent notifyEvent2 = new MyEventManager("event manager 2");
        eventManager.addNotfifyEvent(notifyEvent2);
        eventManager.notifyNotifyEvent("Meeting with the client.");
    }
}

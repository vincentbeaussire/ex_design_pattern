package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private List<NotifyEvent> notifyEvents = new ArrayList<>();

    public void addNotifyEvent(NotifyEvent notifyEvent) {
        this.notifyEvents.add(notifyEvent);
    }

    public void notifyNotifyEvent(String message) {
        for (NotifyEvent notifyEvent : notifyEvents) {
            notifyEvent.update(message);
        }
    }
}

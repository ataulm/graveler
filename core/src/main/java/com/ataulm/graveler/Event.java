package com.ataulm.graveler;

public class Event {

    private final Time timestamp;
    private final Action action;

    public Event(Time timestamp, Action action) {
        this.timestamp = timestamp;
        this.action = action;
    }

}

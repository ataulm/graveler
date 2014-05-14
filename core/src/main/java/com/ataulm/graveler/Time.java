package com.ataulm.graveler;

public class Time {

    private final long millisSinceEpoch;

    public Time(long millisSinceEpoch) {
        this.millisSinceEpoch = millisSinceEpoch;
    }

    public boolean isBefore(Time otherTime) {
        return millisSinceEpoch < otherTime.millisSinceEpoch;
    }

}

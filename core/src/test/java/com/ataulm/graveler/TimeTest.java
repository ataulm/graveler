package com.ataulm.graveler;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class TimeTest {

    @Test
    public void oldTimeIsBeforeCurrentTime() throws Exception {
        Time longTimeAgo = new Time(0);
        Time now = new Time(System.currentTimeMillis());

        assertThat(longTimeAgo.isBefore(now)).isTrue();
    }

}
package com.example.lab3tpa;

import java.util.Date;

class CurrentTime extends Time {

    CurrentTime(long date, int minutes, int seconds, int hour) {
        super(date, minutes, seconds, hour);
    }
    CurrentTime() {
        Date current = new Date();
        this.setDate(current.getTime());
        this.setMinutes(current.getMinutes());
        this.setSeconds(current.getSeconds());
        this.setHour(current.getHours());
    }
}

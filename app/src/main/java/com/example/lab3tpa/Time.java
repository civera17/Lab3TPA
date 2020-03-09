package com.example.lab3tpa;

import java.text.SimpleDateFormat;
import java.util.Date;

class Time {
    private long date;
    private int minutes;
    private int seconds;
    private int hour;

    Time(long date,int minutes, int seconds, int hour) {
        this.date = date;
        this.minutes = minutes;
        this.seconds = seconds;
        this.hour = hour;
    }
    Time(){
        date = 0;
        minutes = 0;
        seconds = 0;
        hour = 0;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Time{" +
                "date=" + date +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                ", hour=" + hour +
                '}';
    }
}

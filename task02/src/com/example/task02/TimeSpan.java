package com.example.task02;

import java.math.*;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeSpan() { }

    public TimeSpan(int hours, int minutes, int seconds) {
        if (hours > 0 && minutes > 0 && seconds > 0) {
            int remMins = seconds / 60;
            this.seconds = seconds % 60;

            int remHours = (minutes + remMins) / 60;
            this.minutes = (minutes + remMins) % 60;

            this.hours = hours + remHours;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0) {
            return;
        }

        int remMins = seconds / 60;
        this.seconds = seconds % 60;

        int remHours = (minutes + remMins) / 60;
        minutes = (minutes + remMins) % 60;

        hours += remHours;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0) {
            return;
        }

        int remHours = minutes / 60;
        this.minutes = minutes % 60;

        hours += remHours;
    }

    public void setHours(int hours) {
        if (hours < 0) {
            return;
        }

        this.hours = hours;
    }

    public void add(TimeSpan time) {
        int remMins = (seconds + time.seconds) / 60;
        seconds = (seconds + time.seconds) % 60;

        int remHours = (minutes + time.minutes + remMins) / 60;
        minutes = (minutes + time.minutes + remMins) % 60;

        hours += time.hours + remHours;
    }

    public boolean isBigger(TimeSpan time) {
        if (hours > time.hours) {
            return true;
        }

        if (hours == time.hours && minutes > time.minutes) {
            return true;
        }

        if (hours == time.hours && minutes == time.minutes && seconds > time.seconds) {
            return true;
        }

        return false;
    }

    public void subtract(TimeSpan time) {

        if (time.isBigger(this)) {
            hours = 0;
            minutes = 0;
            seconds = 0;
        }
        else {
            int remMins = seconds - time.seconds < 0 ? 1 : 0;
            int estSecs = Math.abs(seconds - time.seconds);
            seconds = seconds - time.seconds < 0 ? 60 - estSecs : estSecs;

            int remHours = minutes - time.minutes - remMins < 0 ? 1 : 0;
            int estMins = Math.abs(minutes - time.minutes - remMins);
            minutes = minutes - time.minutes - remMins < 0 ? 60 - estMins : estMins;

            hours = hours - time.hours - remHours;
        }
    }

    public String toString() {
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }

}

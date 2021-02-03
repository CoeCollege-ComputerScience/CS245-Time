package edu.coe.hughes;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        setMinutes(minutes);
        setSeconds(seconds);
    }

`
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        minutes = minutes % 60;
        hours += minutes /60;
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds %60;
        minutes += seconds /60;
        setMinutes(minutes);
    }
}

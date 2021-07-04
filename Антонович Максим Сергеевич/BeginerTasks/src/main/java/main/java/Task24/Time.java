package main.java.Task24;

public class Time implements Comparable <Time> {
    private int seconds;
    private int minutes;
    private int hours;

    public int allTime() {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
        int allSeconds = seconds + minutes * 60 + hours * 3600;
        return allSeconds;
    }

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public Time(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public int compareTo(Time o) {
        if (allTime() > o.allTime()) {
            return -1;
        } else if (allTime() < o.allTime()) {
            return 1; }
        return 0;
    }

    @Override
    public String toString() {
        return "seconds:"+seconds+"; minutes: "+minutes+ "; hours: " + hours + "; allTime: "+allTime();
    }
}
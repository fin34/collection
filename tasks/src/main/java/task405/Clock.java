package task405;

import java.time.LocalTime;

public class Clock {

    private LocalTime timeOnClock;

    public Clock(int hour, int minute) {
        this.timeOnClock = LocalTime.of(hour, minute);
    }

    public LocalTime getTimeOnClock() {
        return timeOnClock;
    }

    public void setTimeOnClock(LocalTime timeOnClock) {
        this.timeOnClock = timeOnClock;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "timeOnClock=" + timeOnClock +
                '}';
    }
}

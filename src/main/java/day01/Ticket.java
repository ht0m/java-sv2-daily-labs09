package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private String Band;
    private LocalDateTime startTime;
    private int price;

    public Ticket(String Band, LocalDateTime startTime, int price) {
        this.Band = Band;
        this.startTime = startTime;
        this.price = price;
    }

    public LocalTime entryTime() {
        return startTime.toLocalTime().minusHours(1);
    }

    public String getBand() {
        return Band;
    }

    public LocalDateTime getStartTimeTime() {
        return startTime;
    }

    public int getPrice() {
        return price;
    }
}

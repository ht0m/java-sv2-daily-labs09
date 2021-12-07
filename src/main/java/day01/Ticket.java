package day01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private String nameOfMusician;
    private LocalDateTime startTime;
    private int price;

    public Ticket(String nameOfMusician, LocalDateTime startTime, int price) {
        this.nameOfMusician = nameOfMusician;
        this.startTime = startTime;
        this.price = price;
    }

    public LocalTime entryTime() {
        return startTime.toLocalTime().minusHours(1);
    }

    public String getNameOfMusician() {
        return nameOfMusician;
    }

    public LocalDateTime getStartTimeTime() {
        return startTime;
    }

    public int getPrice() {
        return price;
    }
}

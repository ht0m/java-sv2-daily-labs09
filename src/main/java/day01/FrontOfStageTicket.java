package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket{
    private String extraCode;

    public FrontOfStageTicket(String nameOfMusician, LocalDateTime startTime, int price, String extraCode) {
        super(nameOfMusician, startTime, price);
        this.extraCode = extraCode;
    }

    @Override
    public LocalTime entryTime() {
        return super.entryTime().minusHours(2);
    }
}

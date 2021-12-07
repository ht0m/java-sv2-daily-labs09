package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    private List<Person> personList = new ArrayList<>();

    public List<Person> getPersonList() {
        return personList;
    }

    public void addPerson(Person p, LocalTime actualTime) {
        if (actualTime.isBefore(p.getTicket().entryTime())) {
            personList.add(p);
        } else {
            throw new IllegalArgumentException("Sorry, permission denied");
        }
    }

    // isBeforet átgondolni

}

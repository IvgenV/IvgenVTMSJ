package Lesson9;

import java.util.Comparator;

public class Comparator1 implements Comparator<BusSchedule> {

    @Override
    public int compare(BusSchedule o1, BusSchedule o2) {
        return o1.getDepartureTime().compareTo(o2.getDepartureTime());
    }
}

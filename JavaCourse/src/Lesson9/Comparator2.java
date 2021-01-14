package Lesson9;

import java.util.Comparator;

public class Comparator2 implements Comparator<BusSchedule> {
    @Override
    public int compare(BusSchedule o1, BusSchedule o2) {

        return o1.getArrivalTime().compareTo(o2.getArrivalTime());
    }
}

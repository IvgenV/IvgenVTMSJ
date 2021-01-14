package Lesson9;

public class BusSchedule {

    public BusSchedule(String[] bus){
        this.companyName = bus[0];
        this.departureTime = bus[1];
        this.ArrivalTime = bus[2];
    }

    String companyName;
    String departureTime;
    String ArrivalTime;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        ArrivalTime = arrivalTime;
    }
}

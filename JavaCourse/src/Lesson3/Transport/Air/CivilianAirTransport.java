package Lesson3.Transport.Air;

public class CivilianAirTransport extends AirTransport {

    private int maxPassengers;
    private int passengers;
    private boolean business;

    private String isFlying(){
        if(maxPassengers> passengers){
            return " Passengers loaded!";
        } else return " You need a bigger plane!";
    }

    private String business(){
        if(business){
            return "Business class available";
        } else return "There is no place for majors";
    }

    public CivilianAirTransport(int passengers, boolean business){
        this.passengers = passengers;
        this.business = business;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int passengers) {
        this.maxPassengers = passengers;
    }

    public boolean isBusiness() {
        return business;
    }

    public void setBusiness(boolean business) {
        this.business = business;
    }

    public Double Kilowatts(){
        return getPower() * 0.74;
    }

    @Override
    public String toString(){
        return "Brand: " + getBrand() + ", maximum speed: " + getMaxspeed() + " km in hour, power: " +
                getPower() + " horse power," +  '\n' + "power in kilowatts: " + Kilowatts() + " ,weight: " +
                getWeight() + " kg, wingspan: "
                + getWingspan() + ", minimum runway length for take-off: " + getMinrunway() + " m," +  '\n' +
                "current number of passengers: " + passengers + " person, maximum number " +
                "passengers: " + maxPassengers + isFlying() + ", business class availability: " + business();
    }
}

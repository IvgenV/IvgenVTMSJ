package Lesson3.Transport.Air;

public class MilitaryAirTransport extends AirTransport {

    private boolean bailout;
    private int rockets;

    private String shot(){
        if(rockets>0){
            return "Rocket go!";
        } else return "no ammunition";
    }

    private String isBailout(){
        if(bailout){
            return "bailout was successful";
        } else return "у вас нет системы катапультирования";
    }

    public MilitaryAirTransport(int rockets,boolean bailout){
        this.rockets = rockets;
        this.bailout = bailout;
    }

    public void setBailout(boolean bailout) {
        this.bailout = bailout;
    }

    public int getRockets() {
        return rockets;
    }

    public void setRockets(int rockets) {
        this.rockets = rockets;
    }

    public Double Kilowatts(){
        return getPower() * 0.74;
    }

    @Override
    public String toString(){
        return "Brand " + getBrand() + ", maximum speed " + getMaxspeed() + " km int hour, power " +
                getPower() + " horse power," + '\n' + "power in kilowatts " + Kilowatts() +  ", weight " +
                getWeight() + " kg, wingspan " + getWingspan() +
                ", minimum runway length for take-off " + getMinrunway() + " m," +  '\n'+
                shot() + ' ' + isBailout();
    }
}

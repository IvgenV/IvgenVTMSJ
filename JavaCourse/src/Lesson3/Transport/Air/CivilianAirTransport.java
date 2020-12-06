package Lesson3.Transport.Air;

public class CivilianAirTransport extends AirTransport {

    private int maxPassengers;
    private int passengers;
    private boolean business;

    private String isFlying(){
        if(maxPassengers> passengers){
            return " Пассажиры загружены!";
        } else return " Вам нужен больший самолет!";
    }

    private String business(){
        if(business){
            return "Бизнес класс в наличии";
        } else return "Мажорам нет места";
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
        return "Марка " + getBrand() + ", максимальная скорость " + getMaxspeed() + " км в час, мощность " +
                getPower() + " лошадиных сил," +  '\n' + "мощность в киловаттах " + Kilowatts() + " ,вес " + getWeight() + " кг, размах крыльев "
                + getWingspan() + ", минимальная длина взлётно-посадочной полосы для взлёта " + getMinrunway() + " м," +  '\n' +
                "текущее количество пассажиров " + passengers + " человек, максимальное количество " +
                "пасажиров " + maxPassengers + isFlying() + ", наличие бизнес класса: " + business();
    }
}

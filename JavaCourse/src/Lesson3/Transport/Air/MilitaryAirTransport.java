package Lesson3.Transport.Air;

public class MilitaryAirTransport extends AirTransport {

    private boolean bailout;
    private int rockets;

    private String shot(){
        if(rockets>0){
            return "ракета пошла!";
        } else return "боеприпасы отсутствуют";
    }

    private String isBailout(){
        if(bailout){
            return "катапультирование прошло успешно";
        } else return "у вас нет такой системы";
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
        return "Марка " + getBrand() + ", максимальная скорость " + getMaxspeed() + " км в час, мощность " +
                getPower() + " лошадиных сил," + '\n' + "мощность в виловаттах " + Kilowatts() +  ", вес " +
                getWeight() + " кг, размах крыльев " + getWingspan() +
                ", минимальная длина взлётно-посадочной полосы для взлёта " + getMinrunway() + " м," +  '\n'+
                shot() + ' ' + isBailout();
    }
}

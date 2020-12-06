package Lesson3.Transport.Land;

import java.util.Objects;

public class FreightTransport extends LandTransport {

    private int carrying;
    private int currentCarrying;

    public FreightTransport(int currentCarrying){
        this.currentCarrying = currentCarrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FreightTransport that = (FreightTransport) o;
        return carrying == that.carrying;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carrying);
    }

    public Double Kilowatts(){
        return getPower() * 0.74;
    }

    @Override
    public String toString(){
        return "Марка " + getBrand() + ", максимальная скорость " + getMaxspeed() + " км в час, мощность " +
                getPower() + " лошадиных сил, вес " + getWeight() + " кило, количество колес "
                + getWheels() + ',' + '\n' +
                "расход топлива " + getFuelconsumption() + " литров на сотню, грузоподъемность " + getCarrying()
                + " киллограм, мощность в киловатах " + Kilowatts() + '\n' +  isCarrying();
    }

    public String isCarrying(){
        if(carrying>currentCarrying){
            return  "Грузовик загружен";
        } else return "Вам нужен грузовик побольше";
    }
}

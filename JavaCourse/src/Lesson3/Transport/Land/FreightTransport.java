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
        return "Brand " + getBrand() + ", maximum speed " + getMaxspeed() + " km in hour, power " +
                getPower() + " horse power, weight " + getWeight() + " kg, number of wheels "
                + getWheels() + ',' + '\n' +
                "fuel consumption " + getFuelconsumption() + " liters per hundred kilometers, lifting capacity " + getCarrying()
                + " kg, power in kilowatts " + Kilowatts() + '\n' +  isCarrying();
    }

    public String isCarrying(){
        if(carrying>currentCarrying){
            return  "Truck loaded";
        } else return "You need a bigger truck";
    }
}

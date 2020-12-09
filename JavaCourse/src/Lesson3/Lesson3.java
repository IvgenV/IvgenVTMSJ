package Lesson3;

import Lesson3.Transport.Air.CivilianAirTransport;
import Lesson3.Transport.Air.MilitaryAirTransport;
import Lesson3.Transport.Land.PassengerCar;
import Lesson3.Transport.Land.FreightTransport;

public class Lesson3 {

    public static void main(String[] args){

    }

    public static void passengerCar(){
        PassengerCar passengerCar = new PassengerCar(2);
        passengerCar.setNumberpassengers(4);
        passengerCar.setTypebody("Седан");
        passengerCar.setWheels(4);
        passengerCar.setBrand("AUDI");
        passengerCar.setFuelconsumption(8.4);
        passengerCar.setMaxspeed(240);
        passengerCar.setWeight(1420);
        passengerCar.setPower(240);
        System.out.println(passengerCar.toString());
    }
    public static void freightTransport(){
        FreightTransport freightTransport = new FreightTransport(187);
        freightTransport.setFuelconsumption(15.4);
        freightTransport.setBrand("FORD");
        freightTransport.setMaxspeed(170);
        freightTransport.setPower(356);
        freightTransport.setWeight(2450);
        freightTransport.setCarrying(1560);
        freightTransport.setWheels(6);
        System.out.println(freightTransport.toString());
    }
    public static void civilianAir(){
        CivilianAirTransport civilianAirTransport = new CivilianAirTransport(367,false);
        civilianAirTransport.setPower(45000);
        civilianAirTransport.setMaxspeed(925);
        civilianAirTransport.setWeight(41000);
        civilianAirTransport.setBrand("Boeing");
        civilianAirTransport.setWingspan(64);
        civilianAirTransport.setMinrunway(2805);
        civilianAirTransport.setMaxPassengers(452);
        System.out.println(civilianAirTransport.toString());
    }
    public static void militaryAir(){
        MilitaryAirTransport militaryAirTransport = new MilitaryAirTransport(15,true);
        militaryAirTransport.setBrand("СУ");
        militaryAirTransport.setPower(1650);
        militaryAirTransport.setMaxspeed(4000);
        militaryAirTransport.setWeight(22220);
        militaryAirTransport.setMinrunway(1350);
        militaryAirTransport.setWingspan(45);
        System.out.println(militaryAirTransport.toString());
    }

}

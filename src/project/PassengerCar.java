package project;

import project.details.*;

public abstract class PassengerCar extends Car {
    private boolean cruiseIsOn;

    public PassengerCar(String color, int maxSpeed, double price, boolean drive, Transmission transmission,
                        Wheel[] wheels, GasTank gasTank, Engine engine, Electric electric, HeadLights headLights,
                        boolean cruiseIsOn) {
        super(color, maxSpeed, price, drive, transmission, wheels, gasTank, engine, electric, headLights);
        this.cruiseIsOn = cruiseIsOn;
    }

    public boolean getCruiseIsOn() {
        return cruiseIsOn;
    }

    public void setCruiseIsOn(boolean cruiseIsOn) {
        this.cruiseIsOn = cruiseIsOn;
    }
    public void switchCruise(){
        if(cruiseIsOn) {
            System.out.println("Круиз выключен");
            cruiseIsOn = false;
        } else {
            System.out.println("Круиз включен");
            cruiseIsOn = true;
        }
    }
}

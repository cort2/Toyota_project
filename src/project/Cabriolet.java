package project;

import project.details.*;

public abstract class Cabriolet extends Car{
    private boolean roof;

    public Cabriolet(String color, int maxSpeed, double price, boolean drive, Transmission transmission,
                     Wheel[] wheels, GasTank gasTank, Engine engine, Electric electric, HeadLights headLights,
                     boolean roof) {
        super(color, maxSpeed, price, drive, transmission, wheels, gasTank, engine, electric, headLights,
                Country.BANGLADESH);
        this.roof = roof;
    }

    public boolean getRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }
    public void moveRoof(){
        if(roof) {
            System.out.println("Крыша опущена");
            roof = false;
        } else {
            System.out.println("Крыша поднята");
            roof = true;
        }
    }
}


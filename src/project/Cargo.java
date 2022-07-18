package project;

import project.details.*;

public abstract class Cargo extends Car{
    private int loadCapacity;

    public Cargo(String color, int maxSpeed, double price, boolean drive, Transmission transmission, Wheel[] wheels,
                 GasTank gasTank, Engine engine, Electric electric, HeadLights headLights, int loadCapacity) {
        super(color, maxSpeed, price, drive, transmission, wheels, gasTank, engine, electric, headLights,
                Country.BANGLADESH);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}


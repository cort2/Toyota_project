package project.models;

import project.Cargo;
import project.Transmission;
import project.details.*;

public class Hiance extends Cargo {
    private Wheel wheel;

    public Hiance(String color, int maxSpeed, double price, boolean drive, Transmission transmission, Wheel[] wheels,
                  GasTank gasTank, Engine engine, Electric electric, HeadLights headLights, int loadCapacity,
                  Wheel wheel) {
        super(color, maxSpeed, price, drive, transmission, wheels, gasTank, engine, electric, headLights, loadCapacity);
        this.wheel = wheel;
    }
}


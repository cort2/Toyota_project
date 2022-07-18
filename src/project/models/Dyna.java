package project.models;

import project.Cargo;
import project.Transmission;
import project.details.*;

public class Dyna extends Cargo {
    private Socket socket;

    public Dyna(String color, int maxSpeed, double price, boolean drive, Transmission transmission, Wheel[] wheels,
                GasTank gasTank, Engine engine, Electric electric, HeadLights headLights, int loadCapacity,
                Socket socket) {
        super(color, maxSpeed, price, drive, transmission, wheels, gasTank, engine, electric, headLights, loadCapacity);
        this.socket = socket;
    }

    public void chargePhone(){
        System.out.println("Телефон заряжается");
    }
}


package project;

import project.details.*;

public class Solara extends Cabriolet{
    private MiniFridge fridge;

    public Solara(String color, int maxSpeed, double price, boolean drive, Transmission transmission, Wheel[] wheels,
                  GasTank gasTank, Engine engine, Electric electric, HeadLights headLights, boolean roof,
                  MiniFridge fridge) {
        super(color, maxSpeed, price, drive, transmission, wheels, gasTank, engine, electric, headLights, roof);
        this.fridge = fridge;
    }

    public void coolTheDrink(){
        System.out.println("Охлаждается напиток");
    }
}


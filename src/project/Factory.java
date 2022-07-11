package project;

import project.details.*;

public class Factory {
    private Country country;
    public Factory(Country country) {
        this.country = country;
    }

    public Engine makeEngine() {
        return new Engine(true);
    }

    public Electric makeElectric() {
        return new Electric(true);
    }

    public GasTank makeGasTank(int i) {
        return new GasTank(0);
    }

    public HeadLights makeHeadLights() {
        return new HeadLights(true);
    }

    public Wheel[] createWheels(SizesOfWheel sizesOfWheel) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(sizesOfWheel, true);
        }
        return wheels;
    }
    public Country getCountry() {
        return country;
    }

}
package project;

import project.details.*;
import project.models.Camry;
import project.models.Dyna;
import project.models.Hiance;
import project.models.Solara;

public class Transporter {
    private Country country;
    private Factory factory;

    public Transporter(Country country, Factory factory) throws CountyFactoryNotEqualException{
        if(country != factory.getCountry()){
            throw new CountyFactoryNotEqualException("Ошибка: не та страна производства");
        }
        this.country = country;
        this.factory = factory;
    }
    public Camry createCamry(String color, double price, Country country) {
        return new Camry("silver",250, 100000, true, Transmission.AUTOMATIC,
                factory.createWheels(SizesOfWheel.SIXTEEN), factory.makeGasTank(), factory.makeEngine(),
                factory.makeElectric(), factory.makeHeadLights(), new UsbPort(true));
    }
    public Hiance createHiance(String color, double price, Country country) {
        return new Hiance("white", 150, 75000, true, Transmission.MECHANIC,
                factory.createWheels(SizesOfWheel.SEVENTEEN), factory.makeGasTank(), factory.makeEngine(),
                factory.makeElectric(), factory.makeHeadLights(), 3000,
                new Wheel(SizesOfWheel.SEVENTEEN, true));
    }
    public Solara createSolara(String color, double price, Country country) {
        return new Solara("black", 300, 200000, true, Transmission.ROBOT,
                factory.createWheels(SizesOfWheel.TWENTY), factory.makeGasTank(), factory.makeEngine(),
                factory.makeElectric(), factory.makeHeadLights(), true, new MiniFridge());
    }
    public Dyna createDyna(String color, double price, Country country) {
        return new Dyna("yellow", 150, 75000, true, Transmission.MECHANIC,
                factory.createWheels(SizesOfWheel.TWENTY), factory.makeGasTank(), factory.makeEngine(),
                factory.makeElectric(), factory.makeHeadLights(), 4, new Socket());
    }

    public Country getCountry() {
        return country;
    }
}

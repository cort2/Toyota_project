package project;

import project.details.*;
import project.models.Camry;
import project.models.Dyna;
import project.models.Hiance;
import project.models.Solara;


public class Stock {
    private Factory factory;
        Stock[] carsArray = {};
        Camry camry = new Camry("silver", 250, 100000, true, Transmission.AUTOMATIC,
                factory.createWheels(SizesOfWheel.SIXTEEN), factory.makeGasTank(), factory.makeEngine(),
                factory.makeElectric(), factory.makeHeadLights(), new UsbPort(true));

        Solara solara = new Solara("black", 300, 200000, true, Transmission.ROBOT,
                factory.createWheels(SizesOfWheel.TWENTY), factory.makeGasTank(), factory.makeEngine(),
                factory.makeElectric(), factory.makeHeadLights(), true, new MiniFridge());

        Hiance hiance = new Hiance("white", 150, 75000, true, Transmission.MECHANIC,
                factory.createWheels(SizesOfWheel.SEVENTEEN), factory.makeGasTank(), factory.makeEngine(),
                factory.makeElectric(), factory.makeHeadLights(), 3000,
                new Wheel(SizesOfWheel.SEVENTEEN, true));

        Dyna dyna = new Dyna("yellow", 150, 75000, true, Transmission.MECHANIC,
                factory.createWheels(SizesOfWheel.TWENTY), factory.makeGasTank(), factory.makeEngine(),
                factory.makeElectric(), factory.makeHeadLights(), 4, new Socket());

        public static Stock[] checkCarsInArray (Car cars, Stock[]carsArray){
            for (Stock element : carsArray) {
                if (element.getName().equals(cars.getName())) ;
            }


        }

        Stock[] newCarsArray = new Stock[carsArray.length + 1] {
            for (int i = 0; i < 1001; i++) {
                newCarsArray[i] = carsArray[i];
            }
            newCarsArray[carsArray.length] = ;
            return
        }



}

package project;

import project.details.*;

public class Runner {
    public static void main(String[] args) throws StartCarExeption {

        Camry camry = new Camry("silver",250, 100000, true, Transmission.AUTOMATIC,
                createWheelsWithRadius(SizesOfWheel.SIXTEEN), new GasTank(50),
                new Engine(true), new Electric(true),
                new HeadLights(true), new UsbPort(true));
                camry.startCar();
                camry.musicOn();
                camry.HeadLightsOn();
                camry.turnCruise();
                camry.stopCar();
                System.out.println();

        Hiance hiance = new Hiance("white", 150, 75000, true, Transmission.MECHANIC,
                createWheelsWithRadius(SizesOfWheel.SEVENTEEN), new GasTank(70),
                new Engine(true), new Electric(true), new HeadLights(true),
                3000, new Wheel(SizesOfWheel.SEVENTEEN, true));
                hiance.startCar();
                hiance.HeadLightsOn();
                hiance.stopCar();
                System.out.println();

        Solara solara = new Solara("black", 300, 200000, true, Transmission.ROBOT,
                createWheelsWithRadius(SizesOfWheel.TWENTY), new GasTank(60), new Engine(true),
                new Electric(true), new HeadLights(true), true,
                new MiniFridge());
                solara.startCar();
                solara.coolTheDrink();
                solara.moveRoof();
                solara.HeadLightsOn();
                solara.stopCar();
                System.out.println();

        Dyna dyna = new Dyna("white", 150, 75000, true, Transmission.MECHANIC,
                createWheelsWithRadius(SizesOfWheel.TWENTY), new GasTank(75), new Engine(true),
                new Electric(true), new HeadLights(true), 4,
                new Socket());
                dyna.startCar();
                dyna.HeadLightsOn();
                dyna.chargePhone();
                dyna.stopCar();
    }
    public static Wheel[] createWheelsWithRadius(SizesOfWheel sizesOfWheel){
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(sizesOfWheel, true);
        }
        return wheels;
    }
}


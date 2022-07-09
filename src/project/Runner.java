package project;

import project.details.*;

public class Runner {
    public static void main(String[] args) {

        Camry camry = new Camry("silver",250, 100000, true, Transmission.AUTOMATIC,
               new Wheel[]{new Wheel(SizesOfWheel.SEVENTEEN, true),
                           new Wheel(SizesOfWheel.SEVENTEEN, true),
                           new Wheel(SizesOfWheel.SEVENTEEN, true),
                           new Wheel(SizesOfWheel.SEVENTEEN, true)}, new GasTank(50), new Engine(true), new Electric(true),
                new HeadLights(true), new UsbPort(true));
                camry.startCar();
                camry.musicOn();
                camry.HeadLightsOn();
                camry.turnCruise();
                camry.stopCar();
                System.out.println();

        Hiance hiance = new Hiance("white", 150, 75000, true, Transmission.MECHANIC,
                new Wheel[]{new Wheel(SizesOfWheel.SIXTEEN, true),
                            new Wheel(SizesOfWheel.SIXTEEN, true),
                            new Wheel(SizesOfWheel.SIXTEEN, true),
                            new Wheel(SizesOfWheel.SIXTEEN, true)}, new GasTank(70), new Engine(true),
                new Electric(true), new HeadLights(true), 3000,
                new Wheel(SizesOfWheel.SEVENTEEN, true));
                hiance.startCar();
                hiance.HeadLightsOn();
                hiance.stopCar();
                System.out.println();

        Solara solara = new Solara("black", 300, 200000, true, Transmission.ROBOT,
                new Wheel[]{new Wheel(SizesOfWheel.TWENTY, true),
                            new Wheel(SizesOfWheel.TWENTY, true),
                            new Wheel(SizesOfWheel.TWENTY, true),
                            new Wheel(SizesOfWheel.TWENTY, true)}, new GasTank(60), new Engine(true),
                new Electric(true), new HeadLights(true), true,
                new MiniFridge());
                solara.startCar();
                solara.coolTheDrink();
                solara.moveRoof();
                solara.HeadLightsOn();
                solara.stopCar();
                System.out.println();

        Dyna dyna = new Dyna("white", 150, 75000, true, Transmission.MECHANIC,
                new Wheel[]{new Wheel(SizesOfWheel.SEVENTEEN, true),
                            new Wheel(SizesOfWheel.SEVENTEEN, true),
                            new Wheel(SizesOfWheel.SEVENTEEN, true),
                            new Wheel(SizesOfWheel.SEVENTEEN, true)}, new GasTank(75), new Engine(true),
                new Electric(true), new HeadLights(true), 4,
                new Socket());
                dyna.startCar();
                dyna.HeadLightsOn();
                dyna.chargePhone();
                dyna.stopCar();
    }
}


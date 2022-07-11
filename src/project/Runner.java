package project;

import project.details.*;

public class Runner {
    public static void main(String[] args) {
        Factory factory = new Factory(Country.BANGLADESH);
        Transporter transporter = new Transporter(Country.BANGLADESH, factory);

        Camry camry = transporter.createCamry("silver", 100000);
        Hiance hiance = transporter.createHiance("white",75000);
        Solara solara = transporter.createSolara("black", 200000);
        Dyna dyna = transporter.createDyna("yellow", 75000);

        try {
            camry.startCar();
        } catch (StartCarExeption e) {
            System.out.println(e.getMessage());
        }
        camry.musicOn();
        camry.HeadLightsOn();
        camry.turnCruise();
        camry.stopCar();
        System.out.println();

        try {
            hiance.startCar();
        } catch (StartCarExeption e) {
            System.out.println(e.getMessage());
        }
        hiance.HeadLightsOn();
        hiance.stopCar();
        System.out.println();

        try {
            solara.startCar();
        } catch (StartCarExeption e) {
            System.out.println(e.getMessage());
        }
        solara.coolTheDrink();
        solara.moveRoof();
        solara.HeadLightsOn();
        solara.stopCar();
        System.out.println();

        try {
            dyna.startCar();
        } catch (StartCarExeption e) {
            System.out.println(e.getMessage());
        }
        dyna.HeadLightsOn();
        dyna.chargePhone();
        dyna.stopCar();
    }
}


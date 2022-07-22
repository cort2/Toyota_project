package project;

import project.models.Camry;
import project.models.Dyna;
import project.models.Hiance;
import project.models.Solara;

public class Runner {
    public static void main(String[] args) {
        Factory factory = new Factory(Country.BANGLADESH);
        Transporter transporter = null;
        try {
            transporter = new Transporter(Country.BANGLADESH, factory);
        } catch (CountyFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }
        Camry camry = transporter.createCamry("silver", 100000, Country.BANGLADESH);
        Hiance hiance = transporter.createHiance("white", 75000, Country.BANGLADESH);
        Solara solara = transporter.createSolara("black", 200000, Country.BANGLADESH);
        Dyna dyna = transporter.createDyna("yellow", 75000, Country.BANGLADESH);

        camry.setFuel(50);
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

        hiance.setFuel(70);
        try {
            hiance.startCar();
        } catch (StartCarExeption e) {
            System.out.println(e.getMessage());
        }
        hiance.HeadLightsOn();
        hiance.stopCar();
        System.out.println();

        solara.setFuel(60);
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

        dyna.setFuel(70);
        try {
            dyna.startCar();
        } catch (StartCarExeption e) {
            System.out.println(e.getMessage());
        }
        dyna.HeadLightsOn();
        dyna.chargePhone();
        dyna.stopCar();

        Stock stock = new Stock();
        try{
            stock.setCamry(camry);
            stock.setSolara(solara);
            stock.setHiance(hiance);
            stock.setDyna(dyna);
            System.out.println("Число машин на складе" + stock.getCountCars());
        } catch (CountStockException e){
            System.out.println(e.getMessage());
        }
    }
}


package project;

import project.exception.ClientHasNoMoneyException;
import project.exception.CountStockException;
import project.exception.CountyFactoryNotEqualException;
import project.exception.StartCarExeption;
import project.models.Camry;
import project.models.Dyna;
import project.models.Hiance;
import project.models.Solara;

public class Runner {
    public static void main(String[] args) {
        Factory factory = new Factory(Country.JAPAN);
        Transporter transporter = null;
        try {
            transporter = new Transporter(Country.JAPAN, factory);
        } catch (CountyFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }
        Camry camry = transporter.createCamry("black", 100000, Country.JAPAN);
        Hiance hiance = transporter.createHiance("black", 15000, Country.JAPAN);
        Solara solara = transporter.createSolara("white", 12000, Country.JAPAN);
        Dyna dyna = transporter.createDyna("black", 22000, Country.JAPAN);

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
        System.out.println();

        Stock stock = new Stock();
        try{
            stock.setCamry(camry);
            stock.setSolara(solara);
            stock.setHiance(hiance);
            stock.setDyna(dyna);
            System.out.println("Число машин на складе " + stock.getCountCars());
        } catch (CountStockException e){
            System.out.println(e.getMessage());
        }
        Manager manager = new Manager(stock, transporter, "Petr");
        Cashier cashier = new Cashier();
        Customer[] customers = { new Customer("Kolya", 10000d),
                new Customer("Petya", 12000d),
                new Customer("Vasya", 15000d),
                new Customer("Igor", 22000d),
                new Customer("Ignat", 11000d),
                new Customer("Ivan", 13000d),
                new Customer("Petr", 8000d),
                new Customer("Ura", 30000d) };

        for (Customer customer : customers) {
            try {
              Car car = manager.sailCar(customer);
              cashier.makeOrder(car);
            } catch (CountStockException e) {
            } catch (ClientHasNoMoneyException e) {
            }
        }
        Cashier.getTotalIncomes();
    }
}


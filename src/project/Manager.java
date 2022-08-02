package project;
import project.exception.ClientHasNoMoneyException;
import project.exception.CountStockException;
import project.models.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Manager {
    private String name;
    private Stock stock;
    private Transporter transporter;
    private Report report = new Report(name);



    public Manager(Stock stock, Transporter transporter, String name) {
        this.stock = stock;
        this.transporter = transporter;
        this.name = name;
    }

    public Car sailCar(Customer customer) throws CountStockException, ClientHasNoMoneyException {
        if (customer.getMoney() >= 22000d) {
            try {
                Dyna dyna = stock.getDyna();
                report.setCars(dyna);
                return dyna;
            } catch (RuntimeException e) {
                Dyna dyna = transporter.createDyna("black", 22000d, Country.JAPAN);
                stock.setDyna(dyna);
                return stock.getDyna();
            }
        } else if (customer.getMoney() >= 15000d) {
            try {
                Hiance hiance = stock.getHiance();
                report.setCars(hiance);
                return hiance;
            } catch (RuntimeException e) {
                Hiance hiance = transporter.createHiance("black", 15000d, Country.JAPAN);
                stock.setHiance(hiance);
                return stock.getHiance();
            }
        } else if (customer.getMoney() >= 12000d) {
            try {
                Solara solara = stock.getSolara();
                report.setCars(solara);
                return solara;
            } catch (RuntimeException e) {
                Solara solara = transporter.createSolara("white", 12000d, Country.JAPAN);
                stock.setSolara(solara);
                return stock.getSolara();
            }
        } else if (customer.getMoney() >= 10000d) {
            try {
                Camry camry = stock.getCamry();
                report.setCars(camry);
                return camry;
            } catch (RuntimeException e) {
                Camry camry = transporter.createCamry("black", 10000d, Country.JAPAN);
                stock.setCamry(camry);
                return stock.getCamry();
            }
        }
        throw new ClientHasNoMoneyException("У клиента нет денег");
    }
    public String getName() {
        return name;
    }
    public void reportGenerate() throws IOException {

        FileWriter fileWriter = new FileWriter("D:\\java\\repos\\toyota_project\\toyota_directory\\report "
                + name + ".txt", true);
        fileWriter.write(name + "\n");
        double priceSum = 0;
        double selfPriceSum = 0;
        Car[] cars = report.getCars();
        for (Car car : cars) {
            double selfPrice = 0;
            if (car instanceof Dyna) {
                selfPrice = Dir.DYNA.getSelfPrice();
            } else if (car instanceof Camry) {
                selfPrice = Dir.CAMRY.getSelfPrice();
            } else if (car instanceof Solara) {
                selfPrice = Dir.SOLARA.getSelfPrice();
            } else if (car instanceof Hiance) {
                selfPrice = Dir.SOLARA.getSelfPrice();
            }
            String reporting = car.getClass().getSimpleName() + " - " +
                    car.getPrice() + " - " + selfPrice;
            fileWriter.write(reporting + "\n");
            priceSum += car.getPrice();
            selfPriceSum += selfPrice;
        }
        String reporting = "Итог: доходы - " + priceSum + " расходы - " + selfPriceSum + " прибыль - "  +
                (priceSum - selfPriceSum);
        fileWriter.write(reporting + "\n");
        fileWriter.close();
    }
}
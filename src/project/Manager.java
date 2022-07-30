package project;
import project.exception.ClientHasNoMoneyException;
import project.exception.CountStockException;
import project.models.*;
public class Manager {
    private Stock stock;
    private Transporter transporter;

    public Manager(Stock stock, Transporter transporter) {
        this.stock = stock;
        this.transporter = transporter;
    }

    public Car sailCar(Customer customer) throws CountStockException, ClientHasNoMoneyException {
        if (customer.getMoney() >= 22000d) {
            try {
                return stock.getDyna();
            } catch (RuntimeException e) {
                Dyna dyna = transporter.createDyna("black", 22000d, Country.JAPAN);
                stock.setDyna(dyna);
                return stock.getDyna();
            }
        } else if (customer.getMoney() >= 15000d) {
            try {
                return stock.getHiance();
            } catch (RuntimeException e) {
                Hiance hiance = transporter.createHiance("black", 15000d, Country.JAPAN);
                stock.setHiance(hiance);
                return stock.getHiance();
            }
        } else if (customer.getMoney() >= 12000d) {
            try {
                return stock.getSolara();
            } catch (RuntimeException e) {
                Solara solara = transporter.createSolara("white", 12000d, Country.JAPAN);
                stock.setSolara(solara);
                return stock.getSolara();
            }
        } else if (customer.getMoney() >= 10000d) {
            try {
                return stock.getCamry();
            } catch (RuntimeException e) {
                Camry camry = transporter.createCamry("black", 10000d, Country.JAPAN);
                stock.setCamry(camry);
                return stock.getCamry();
            }
        }
        throw new ClientHasNoMoneyException("У клиента нет денег");
    }
}
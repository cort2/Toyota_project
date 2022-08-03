package project;

import java.io.FileWriter;
import java.io.IOException;

public class Boss {
    private Manager manager;
    private double generalPriceSum;
    private double generalSelfPriceSum;
    private double generalSelfPrice;

    public Boss(Manager manager) {
        this.manager = manager;
    }

    public void bossReport() throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\java\\repos\\toyota_project\\toyota_directory\\" +
                "report Boss.txt", true);
        fileWriter.write("Boss" + "\n");
        String reporting = manager.getName() + " - " + manager.getPriceSum() + " - " + manager.getSelfPriceSum()
                + " - " + manager.getSelfPrice();
        fileWriter.write(reporting + "\n");

        generalPriceSum += manager.getPriceSum();
        generalSelfPriceSum += manager.getSelfPriceSum();
        generalSelfPrice += manager.getSelfPrice();

        String reporting1 = "Итого: общие доходы - " + generalPriceSum + " общие расходы - " + generalSelfPriceSum +
                " общая прибыль - " + generalSelfPrice;
        fileWriter.write(reporting1 +"\n");
        fileWriter.close();
    }

}

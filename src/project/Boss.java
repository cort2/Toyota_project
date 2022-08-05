package project;

import java.io.FileWriter;
import java.io.IOException;

public class Boss {

    public void bossReport(Manager[] managers) throws IOException {
        double generalPriceSum = 0;
        double generalSelfPriceSum = 0;
        double generalSelfPrice = 0;
        FileWriter fileWriter = new FileWriter("D:\\java\\repos\\toyota_project\\src\\toyota_directory\\" +
                "report_Boss.txt", true);
        fileWriter.write("Boss" + "\n");

        for(Manager manager : managers) {
            String reporting = manager.getName() + "  доходы - " + manager.getPriceSum() + " расходы - "
                    + manager.getSelfPriceSum() + " прибыль - " + manager.getSelfPrice();
            fileWriter.write(reporting + "\n");
            generalPriceSum += manager.getPriceSum();
            generalSelfPriceSum += manager.getSelfPriceSum();
            generalSelfPrice += manager.getSelfPrice();
        }
        String reporting = "Итого: общие доходы - " + generalPriceSum + " общие расходы - " + generalSelfPriceSum +
                " общая прибыль - " + generalSelfPrice;
        fileWriter.write(reporting +"\n");
        fileWriter.close();
    }
}

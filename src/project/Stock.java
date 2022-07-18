package project;

import project.details.SizesOfWheel;
import project.details.Wheel;

public class Stock {
    private int countCamry;
    private int countHiance;
    private int countSolara;
    private int countDyna;

    public Stock( int countCamry, int countHiance, int countSolara, int countDyna){
            this.countCamry = countCamry;
            this.countHiance = countHiance;
            this.countSolara = countSolara;
            this.countDyna = countDyna;
        }

    public Stock[] stockPlace() {
        Stock[] stocks = new Stock[1000];
        for (int i = 0; i < stocks.length; i++) {

        }
        return stocks;
    }

        public int getCountCamry () {

            return countCamry;
        }

        public void setCountCamry ( int countCamry){
            this.countCamry = countCamry;
        }

        public int getCountHiance () {
            return countHiance;
        }

        public void setCountHiance ( int countHiance){
            this.countHiance = countHiance;
        }

        public int getCountSolara () {
            return countSolara;
        }

        public void setCountSolara ( int countSolara){
            this.countSolara = countSolara;
        }

        public int getCountDyna () {
            return countDyna;
        }

        public void setCountDyna ( int countDyna){
            this.countDyna = countDyna;
        }
}


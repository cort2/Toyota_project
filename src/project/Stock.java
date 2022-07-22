package project;

import project.models.*;

public class Stock {
    private int countCars = 0;
    private Camry[] camryArray = new Camry[0];
    private Solara[] solaraArray = new Solara[0];
    private Hiance[] hianceamryArray = new Hiance[0];
    private Dyna[] dynaArray = new Dyna[0];

    public Stock() {
    }

    public int getCountCars() {
        return countCars;
    }
    public Camry getCamry() throws CountStockException {
        if(camryArray.length == 0){
            throw  new CountStockException("На складе нет такой машины");
        } else {
            Camry camry = camryArray[camryArray.length - 1];
            Camry[] newArray = new Camry[camryArray.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = camryArray[i];
            }
            camryArray = newArray;
            countCars--;
            return camry;
        }
    }
    public  void setCamry(Camry camry) throws CountStockException {
        if(countCars >= 1000){
            throw  new CountStockException("Склад заполнен");
        } else {
            Camry[] newArray = new Camry[camryArray.length + 1];
            for (int i = 0; i < camryArray.length; i++) {
                newArray[i] = camryArray[i];
            }
            newArray[camryArray.length] = camry;
            camryArray = newArray;
            countCars++;
        }
    }
    public int getCountCamry() {
        return camryArray.length;
    }




}

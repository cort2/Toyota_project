package project;

import project.exception.CountStockException;
import project.models.*;

public class Stock {
    private int countCars = 0;
    private Camry[] camryArray = new Camry[0];
    private Solara[] solaraArray = new Solara[0];
    private Hiance[] hianceArray = new Hiance[0];
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
    public Solara getSolara() throws CountStockException {
        if(solaraArray.length == 0){
            throw  new CountStockException("На складе нет такой машины");
        } else {
            Solara solara = solaraArray[solaraArray.length - 1];
            Solara[] newArray = new Solara[solaraArray.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = solaraArray[i];
            }
            solaraArray = newArray;
            countCars--;
            return solara;
        }
    }
    public  void setSolara(Solara solara) throws CountStockException {
        if(countCars >= 1000){
            throw  new CountStockException("Склад заполнен");
        } else {
            Solara[] newArray = new Solara[solaraArray.length + 1];
            for (int i = 0; i < solaraArray.length; i++) {
                newArray[i] = solaraArray[i];
            }
            newArray[solaraArray.length] = solara;
            solaraArray = newArray;
            countCars++;
        }
    }
    public int getCountSolara() {
        return solaraArray.length;
    }
    public Hiance getHiance() throws CountStockException {
        if(hianceArray.length == 0){
            throw  new CountStockException("На складе нет такой машины");
        } else {
            Hiance hiance = hianceArray[hianceArray.length - 1];
            Hiance[] newArray = new Hiance[hianceArray.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = hianceArray[i];
            }
            hianceArray = newArray;
            countCars--;
            return hiance;
        }
    }
    public  void setHiance(Hiance hiance) throws CountStockException {
        if(countCars >= 1000){
            throw  new CountStockException("Склад заполнен");
        } else {
            Hiance[] newArray = new Hiance[hianceArray.length + 1];
            for (int i = 0; i < hianceArray.length; i++) {
                newArray[i] = hianceArray[i];
            }
            newArray[hianceArray.length] = hiance;
            hianceArray = newArray;
            countCars++;
        }
    }
    public int getCountHiance() {
        return hianceArray.length;
    }
    public Dyna getDyna() throws CountStockException {
        if(dynaArray.length == 0){
            throw  new CountStockException("На складе нет такой машины");
        } else {
            Dyna dyna = dynaArray[dynaArray.length - 1];
            Dyna[] newArray = new Dyna[dynaArray.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = dynaArray[i];
            }
            dynaArray = newArray;
            countCars--;
            return dyna;
        }
    }
    public  void setDyna(Dyna dyna) throws CountStockException {
        if(countCars >= 1000){
            throw  new CountStockException("Склад заполнен");
        } else {
            Dyna[] newArray = new Dyna[dynaArray.length + 1];
            for (int i = 0; i < dynaArray.length; i++) {
                newArray[i] = dynaArray[i];
            }
            newArray[dynaArray.length] = dyna;
            dynaArray = newArray;
            countCars++;
        }
    }
    public int getCountDyna() {
        return dynaArray.length;
    }
}

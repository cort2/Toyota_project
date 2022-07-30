package project;

import project.details.*;
import project.exception.StartCarExeption;

public abstract class Car {
    private String color;
    private int maxSpeed;
    private boolean drive;
    private double price;
    private Transmission transmission;
    private Wheel[] wheels;
    private GasTank gasTank;
    private Engine engine;
    private Electric electric;
    private HeadLights headLights;
    private Country country;

    public Car(String color, int maxSpeed, double price, boolean drive, Transmission transmission, Wheel[] wheels,
               GasTank gasTank, Engine engine, Electric electric, HeadLights headLights, Country country) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.transmission = transmission;
        this.drive = drive;
        this.wheels = wheels;
        this.gasTank = gasTank;
        this.engine = engine;
        this.electric = electric;
        this.headLights = headLights;
        this.country = country;
    }

    public boolean getDrive(){
        return this.drive;
    }
    public void setDrive(boolean drive){
        this.drive = drive;
    }
    public void HeadLightsOn(){
        if(headLights.getHeadLightsIsOn()) {
            System.out.println("Фары включены");
        }
    }
    public void HeadLightsOff(){
        if(headLights.getHeadLightsIsOn()) {
            System.out.println("Фары выключены");
        }
    }

    public void startCar() throws StartCarExeption {
        String messageProblem = "";
        if (gasTank.getVolume() == 0) {
            messageProblem += "Ошибка: нет топлива; \n";
        }else if (!engine.getNotBrokenEngine()) {
            messageProblem += "Ошибка: двигатель сломан; \n";
        }else if(!electric.getNotBrokenElectric()){
            messageProblem += "Ошибка: неисправна электрическая часть, сходите в релейную; \n";
        }
            for (Wheel wheel:wheels) {
                if(!wheel.getNotBrokenWheel()) {
                    messageProblem += "Ошибка: колесо пробито; \n";
                }
            }
            if(!messageProblem.equals("")){
                throw new StartCarExeption(messageProblem);
            }
            System.out.println("Машина начала движение");
            setDrive(true);
    }
    public void stopCar(){
        System.out.println("Машина остановилась");
        setDrive(false);
    }
    public void setFuel(int volume){
        gasTank.setVolume(volume);
    }

    public double getPrice() {
        return price;
    }
}

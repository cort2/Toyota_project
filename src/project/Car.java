package project;

import project.details.*;

public abstract class Car {
    private String color;
    private int maxSpeed;
    private double price;
    private boolean drive;
    private Transmission transmission;
    private Wheel[] wheels;
    private GasTank gasTank;
    private Engine engine;
    private Electric electric;
    private HeadLights headLights;

    public Car(String color, int maxSpeed, double price, boolean drive, Transmission transmission, Wheel[] wheels,
               GasTank gasTank, Engine engine, Electric electric, HeadLights headLights) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.drive = drive;
        this.transmission = transmission;
        this.wheels = wheels;
        this.gasTank = gasTank;
        this.engine = engine;
        this.electric = electric;
        this.headLights = headLights;
    }
    public void HeadLightsOn(){
        System.out.println("Фары включены");
    }
    public void HeadLightsOff(){
        System.out.println("Фары выключены");
    }

    public void startCar(){
        try {
            if (gasTank.getVolume() == 0) {
                throw new StartCarExeption("Ошибка: нет топлива");
            }
        } catch (StartCarExeption exeption) {
            System.out.println(exeption.getMessage());
        }
        try {
            if(!engine.getNotBrokenEngine()) {
                throw new StartCarExeption("Ошибка: двигатель сломан");
            }
        } catch (StartCarExeption exeption) {
            System.out.println(exeption.getMessage());
        }
        try {
            if(!electric.getNotBrokenElectric()){
                throw new StartCarExeption("Ошибка: неисправна электрическая часть, сходите в релейную");
            }
        } catch (StartCarExeption exeption) {
            System.out.println(exeption.getMessage());
        }
        try {
            for (Wheel wheel:wheels) {
                if(!wheel.getNotBrokenWheel()) {
                    throw new StartCarExeption("Ошибка: колесо пробито");
                }
            }
        }catch (StartCarExeption exeption) {
            System.out.println(exeption.getMessage());
        }
        if(gasTank.getVolume() > 0 && engine.getNotBrokenEngine() && electric.getNotBrokenElectric()
            && wheels[0].getNotBrokenWheel() && wheels[1].getNotBrokenWheel()
            && wheels[2].getNotBrokenWheel() && wheels[3].getNotBrokenWheel()){
            drive = true;
            System.out.println("Машина начала движение");
        }
    }

    public void stopCar(){
        drive = false;
        System.out.println("Машина остановилась");
    }
}

package project;

import project.details.*;

public abstract class Car {
    private String color;
    private int maxSpeed;
    private double price;
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
        this.transmission = transmission;
        this.wheels = wheels;
        this.gasTank = gasTank;
        this.engine = engine;
        this.electric = electric;
        this.headLights = headLights;
    }

    public Car() {

    }

    public void HeadLightsOn(){
        System.out.println("Фары включены");
    }
    public void HeadLightsOff(){
        System.out.println("Фары выключены");
    }

    public void startCar() throws StartCarExeption {
        if (gasTank.getVolume() == 0) {
            throw new StartCarExeption("Ошибка: нет топлива");
        }else if (!engine.getNotBrokenEngine()) {
            throw new StartCarExeption("Ошибка: двигатель сломан");
        }else if(!electric.getNotBrokenElectric()){
                throw new StartCarExeption("Ошибка: неисправна электрическая часть, сходите в релейную");
        }
            for (Wheel wheel:wheels) {
                if(!wheel.getNotBrokenWheel()) {
                    throw new StartCarExeption("Ошибка: колесо пробито");
                }
            }
            System.out.println("Машина начала движение");
    }
    public void stopCar(){
        System.out.println("Машина остановилась");
    }
}

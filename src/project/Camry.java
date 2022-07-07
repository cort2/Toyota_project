package project;

import project.details.*;

public class Camry extends PassengerCar{
    private UsbPort usb;

    public Camry(String color, int maxSpeed, double price, boolean drive, Transmission transmission, Wheel[] wheels,
                 GasTank gasTank, Engine engine, Electric electric, HeadLights headLights, boolean cruiseIsOn,
                 UsbPort usb) {
        super(color, maxSpeed, price, drive, transmission, wheels, gasTank, engine, electric, headLights, cruiseIsOn);
        this.usb = usb;
    }

    public void musicOn(){
        System.out.println("Музыка включена");
    }
    public void musicOff(){
        System.out.println("Музыка выключена");
    }
}

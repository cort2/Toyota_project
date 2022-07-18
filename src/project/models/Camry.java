package project.models;

import project.PassengerCar;
import project.Transmission;
import project.details.*;

public class Camry extends PassengerCar {
    private UsbPort usbPort;

    public Camry(String color, int maxSpeed, double price, boolean drive, Transmission transmission, Wheel[] wheels,
                 GasTank gasTank, Engine engine, Electric electric, HeadLights headLights, UsbPort usb) {
        super(color, maxSpeed, price, drive, transmission, wheels, gasTank, engine, electric, headLights);
        this.usbPort = usbPort;
    }

    public void musicOn(){
        System.out.println("Музыка включена");
    }
    public void musicOff(){
        System.out.println("Музыка выключена");
    }
}

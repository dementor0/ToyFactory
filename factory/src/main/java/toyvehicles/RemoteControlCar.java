package toyvehicles;

import Exceptions.AntennaException;
import Exceptions.DefectiveBatteryException;
import components.Antenna;
import components.RemoteControllerCar;

public class RemoteControlCar extends Car {     // класс представляющий радиоуправляемую машинку
    private static final RemoteControllerCar REMOTE_CONTROL = new RemoteControllerCar();
    private static final Antenna ANTENNA = new Antenna();

    public RemoteControlCar() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println("Звук двигателя");
    }

    public void blinkLights() {         // метод моргания фарами
        super.blinkLights();

    }
    public void blinkAntenna(){
        ANTENNA.blinkLight();
    }           // метод моргания антенной

    public void checkSignal() throws DefectiveBatteryException, AntennaException {      // метод проверки сигнала
        REMOTE_CONTROL.checkAntenna();
    }
}

package components;

import Exceptions.AntennaException;
import Exceptions.DefectiveBatteryException;
import utils.SupplyUtils;


public class RemoteControllerCar implements IRemoteController {

    private final Antenna antenna;
    private final SupplyUtils supplyUtils = new SupplyUtils();
    private RadioModule radioModule;
    private Battery battery;

    public RemoteControllerCar() {
        this.antenna = new Antenna();
        this.radioModule = new RadioModule();
        this.battery = supplyUtils.getBattery("AAA");
    }

    @Override
    public void sendRequest() {                    // отправка запроса
        IRemoteController.super.sendRequest();
    }

    @Override
    public void vibrate() {                        // вибрация пульта
       IRemoteController.super.vibrate();
    }

    public void checkAntenna() throws DefectiveBatteryException {
        double chance = Math.random();

        if (chance < 0.5) {
            throw new DefectiveBatteryException("Батарейка дефектная, проверка антенны прервана");
        } else {
            sendRequest();  // отправка широкополосного запроса
            try {
                antenna.sendSerialNumber();     // отправка серийного номера антенны
            } catch (AntennaException e){
                System.out.println(e.getMessage());
                resendRequestAndSerialNumber();     // повторная отправка серийного номера антенны
            } finally {
                vibrate();
            }
        }
    }
    private void resendRequestAndSerialNumber() {
        System.out.println("Повторная отправка запроса и серийного номера");
        sendRequest();
        try {
            antenna.sendSerialNumber();     // отправка серийного номера антенны
        } catch (AntennaException e) {
            System.out.println(e.getMessage());
        }
    }
    public Battery getOldBattery(){
        return this.battery;
    } // метод необходимый для замены батарейки
}

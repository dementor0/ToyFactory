package components;


import Exceptions.BladesBlockedException;
import Exceptions.DefectiveBatteryException;
import Exceptions.EngineDamagedException;
import Exceptions.RotorBlockedException;
import toyvehicles.RemoteControlHelicopter;
import utils.SupplyUtils;

public class RemoteControllerHelicopter implements IRemoteController {  // класс представляющий пульт вертолета

    private final SupplyUtils supplyUtils = new SupplyUtils();
    private final RemoteControlHelicopter helicopter;
    private Chip chip;
    private Battery battery;

    public RemoteControllerHelicopter() {
        this.helicopter = new RemoteControlHelicopter();
        this.chip = new Chip();
        this.battery = supplyUtils.getBattery("AA");
    }

    @Override
    public void sendRequest() {                    // отправка запроса
        IRemoteController.super.sendRequest();
    }  // отправка широкополосного запроса

    public void vibrateOnce() {
        System.out.println("Пульт вибрирует один раз");
    }

    public void vibrateThrice() {
        System.out.println("Пульт вибрирует три раза");
    }

    public void checkRadioModule() throws DefectiveBatteryException {  // проверка радио модуля
        double chance = Math.random();

        if (chance < 0.5) {
            throw new DefectiveBatteryException("Батарейка дефектная, проверка радио-модуля прервана");
        } else {
            sendRequest();  // отправка широкополосного запроса
            try {
                helicopter.moveBlades(); // попытка двигать лопастями
            } catch (BladesBlockedException | RotorBlockedException e){
                System.out.println(e.getMessage());
                vibrateOnce();
            } catch (EngineDamagedException e) {
                System.out.println(e.getMessage());
                vibrateThrice();
            }
        }
    }
    public Battery getOldBattery(){
        return this.battery;
    }  // метод необходимый для замены батарейки
}

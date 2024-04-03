package Inspector;

import Exceptions.AntennaException;
import Exceptions.DefectiveBatteryException;
import components.RemoteControllerCar;
import components.RemoteControllerHelicopter;
import softtoys.Bear;
import softtoys.Cow;
import softtoys.SoftToys;
import toyvehicles.Car;
import toyvehicles.DefaultCar;
import toyvehicles.RemoteControlCar;
import toyvehicles.RemoteControlHelicopter;
import toyweapons.AK47;
import toyweapons.M16;
import toyweapons.WaterGun;
import toyweapons.Weapons;
import utils.SupplyUtils;

public class QAInspector {
    public void infoSoftToys(SoftToys softToys){
        if (softToys instanceof Bear){
            Bear bear = new Bear();
            System.out.println("\nИнформация о плюшевом медведе:\n" + "Тип наполнителя - " + bear.getFillerType() +
                    "\nАртикул - " + bear.getArticleNumber() + "\nИздаваемый звук: ");
            bear.makeSound();
        } else {
            Cow cow = new Cow();
            System.out.println("\nИнформация о плюшевой корове:\n" + "Тип наполнителя - " + cow.getFillerType() +
                    "\nАртикул - " + cow.getArticleNumber() + "\nИздаваемый звук: ");
            cow.makeSound();
        }
    }
    public void infoVehiclesToys(Car car) {
        if (car instanceof DefaultCar){
            DefaultCar defaultCar = new DefaultCar();
            System.out.println("\nИнформация о обычной машинке:\n" + "Артикул - " + defaultCar.getArticleNumber() + "\nПроверка фар:");
            defaultCar.blinkLights();
            System.out.println("Проверка клаксона:");
            defaultCar.makeSound();
        } else {
            RemoteControlCar remoteControlCar = new RemoteControlCar();
            RemoteControllerCar remoteControllerCar = new RemoteControllerCar();
            System.out.println("\nИнформация о радиоуправляемой машинке:\n" + "Артикул - " + remoteControlCar.getArticleNumber() + "\nПроверка фар:");
            remoteControlCar.blinkLights();
            System.out.println("Проверка мигания антенны:");
            remoteControlCar.blinkAntenna();
            System.out.println("Проверка звука двигателя:");
            remoteControlCar.makeSound();
            try {
                System.out.println("Попытка проверить сигнал");
                remoteControlCar.checkSignal();
            } catch (DefectiveBatteryException e) {
                SupplyUtils supplyUtils = new SupplyUtils();
                supplyUtils.exchangeBattery(remoteControllerCar.getOldBattery());
                System.out.println("Произведена замена батарейки");
            } catch (AntennaException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void infoHelicopterToy(RemoteControlHelicopter remoteControlHelicopter)  {
        RemoteControllerHelicopter remoteControllerHelicopter = new RemoteControllerHelicopter();
        System.out.println("\nИнформация о радиоуправляемом вертолете:\n" + "Артикул - " + remoteControlHelicopter.getArticleNumber());
        try {
            remoteControlHelicopter.checkSignal();
        } catch (DefectiveBatteryException e){
            SupplyUtils supplyUtils = new SupplyUtils();
            supplyUtils.exchangeBattery(remoteControllerHelicopter.getOldBattery());
            System.out.println("Произведена замена батарейки");
        }
    }

    public void infoWeaponToys(Weapons weapons){
        if (weapons instanceof AK47){
            AK47 ak47 = new AK47();
            System.out.println("\nИнформация о игрушечном AK47: " + "\nАртикул - " + ak47.getArticleNumber() + "\nПроверка стрельбы: ");
            ak47.shooting();
        } else if (weapons instanceof M16){
            M16 m16 = new M16();
            System.out.println("\nИнформация о игрушечном M16: " + "\nАртикул - " + m16.getArticleNumber() + "\nПроверка стрельбы: ");
            m16.shooting();
        } else {
            WaterGun waterGun = new WaterGun();
            System.out.println("\nИнформация о водном пистолете: " + "\nАртикул - " + waterGun.getArticleNumber() + "\nПроверка стрельбы: ");
            waterGun.shooting();
        }
    }
}

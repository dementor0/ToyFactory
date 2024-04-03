package utils;

import components.Battery;
import components.Chip;
import components.RadioModule;

import java.util.Random;

public class SupplyUtils{                                 // класс исполняющий роль кладовщика
    private RadioModule radioModule;
    private Chip chip;
    private Battery battery;
    private Filler filler;


    public SupplyUtils() {
        radioModule = new RadioModule();
        chip = new Chip();
        battery = new Battery();
        filler = new Filler();
    }

    public Battery getBattery(String type) {   // метод формирования объекта Battery
        Battery battery = new Battery();
        battery.setType(type);
        battery.setBrand(generateBatteryBrand());
        return battery;
    }

    public RadioModule exchangeRadioModule(RadioModule oldModule) { return new RadioModule(); }  // замена радио модуля

    public Chip exchangeChip(Chip oldChip) { return new Chip(); }  // замена чипа

    public Battery exchangeBattery(Battery oldBattery) {           // замена батарейки
        BatteryBrand newBrand = generateBatteryBrand();
        return new Battery(oldBattery.getType(),newBrand);

    }
    private BatteryBrand generateBatteryBrand() {   // метод установки бренда батарейки

        Random random = new Random();
        int randomIndex = random.nextInt(4);
        return switch (randomIndex) {
            case 0 -> BatteryBrand.ENERGIZER;
            case 1 -> BatteryBrand.DURACELL;
            case 2 -> BatteryBrand.VARTA;
            default -> BatteryBrand.GP;
        };
    }

}

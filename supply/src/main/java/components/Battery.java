package components;

import utils.BatteryBrand;

public class Battery {
    private BatteryType type;
    private BatteryBrand brand;

    public Battery(BatteryType type, BatteryBrand brand) {
        this.type = type;
        this.brand = brand;
    }
    public Battery() {}

    public void setType(String type) {
        try {
            this.type = BatteryType.valueOf(type.toUpperCase());
            if(this.type == BatteryType.CRONA){
                showVoltage();
            }
        } catch (IllegalArgumentException ex){
            System.out.println("Ошибка выбора типа батарейки " + ex.getMessage());
        }
    }

    public void setBrand(BatteryBrand brand) {
        this.brand = brand;
    }

    public BatteryType getType() {
        return type;
    }

    public void showVoltage() { System.out.println("Отображение текущего напряжения"); }
    public enum BatteryType {
        AAA,
        AA,
        CRONA
    }
}

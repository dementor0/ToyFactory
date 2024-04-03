package toyweapons;

public class WaterGun extends Weapons {      // класс представляющий водяной пистолет

    @Override
    protected void makeSound() { System.out.println("Выпуск струи воды"); }

    @Override
    protected void blinkLight() {}

    @Override
    public void shooting() {
        makeSound();
        blinkLight();
    }
}

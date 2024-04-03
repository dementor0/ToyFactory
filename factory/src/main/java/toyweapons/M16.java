package toyweapons;

public class M16 extends Weapons {       // класс представляющий муляж M16

    @Override
    protected void makeSound() { System.out.println("Звук M16"); }

    @Override
    protected void blinkLight() { System.out.println("Моргает белым фонариком"); }

    @Override
    public void shooting() {
        makeSound();
        blinkLight();
    }
}

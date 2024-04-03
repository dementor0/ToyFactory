package toyweapons;

public class AK47 extends Weapons {     // класс представляющий муляж AK47

    @Override
    public void makeSound() { System.out.println("Звук АК47"); }

    @Override
    public void blinkLight() { System.out.println("Моргает красным фонариком"); }

    @Override
    public void shooting() {
        makeSound();
        blinkLight();
    }
}

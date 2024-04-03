package toyvehicles;

public class DefaultCar extends Car {       // класс представляющий обычную машинку

    @Override
    public void makeSound() {
        System.out.println("Бип-бип");
    }

    @Override
    public void blinkLights(){
        super.blinkLights();
    }
}

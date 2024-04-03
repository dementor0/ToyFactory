package components;

import Exceptions.AntennaException;
import lombok.Getter;

import java.util.UUID;

@Getter
public class Antenna {
    private final String serialNumber = UUID.randomUUID().toString();

    public void blinkLight() {
        System.out.println("Моргание лампочкой антенны");
    }

    public void sendSerialNumber() throws AntennaException {            // метод послания серийного номера
        double chance = Math.random();

        if (chance < 0.33) {
            throw new AntennaException("Серийный номер не найден по непонятным причинам");
        } else if (chance < 0.66) {
            throw new AntennaException("Серийный номер оказался дефектным");
        } else {
            System.out.println(getSerialNumber());
            System.out.println("Отправка серийного номера антенны успешна");
        }
    }
}

package toyvehicles;

import Exceptions.BladesBlockedException;
import Exceptions.DefectiveBatteryException;
import Exceptions.EngineDamagedException;
import Exceptions.RotorBlockedException;
import components.RemoteControllerHelicopter;
import utils.GenerateArticle;

public class RemoteControlHelicopter {          // класс представляющий радиоуправляемый вертолет
    private static final String ARTICLE_NUMBER = GenerateArticle.generateArticleNumber(RemoteControlHelicopter.class.getSimpleName());   // артикул
    private static final RemoteControllerHelicopter REMOTE_CONTROL = new RemoteControllerHelicopter();  // пульт

    public void moveBlades() throws BladesBlockedException, RotorBlockedException, EngineDamagedException {     // метод движения лопастей
        double chance = Math.random();
        if (chance < 0.25) {
            throw new BladesBlockedException("Непредвиденная ситуация: лопасти заблокированы");
        } else if (chance < 0.5) {
            throw new RotorBlockedException("Непредвиденная ситуация: ротор заблокирован");
        } else if (chance < 0.75) {
            throw new EngineDamagedException("Непредвиденная ситуация: повреждён двигатель");
        } else {
            System.out.println("Лопасти успешно двигаются");
        }
    }
    public void checkSignal() throws DefectiveBatteryException {        // метод проверки сигнала
        REMOTE_CONTROL.checkRadioModule();
    }
    public String getArticleNumber() { return ARTICLE_NUMBER; }
}

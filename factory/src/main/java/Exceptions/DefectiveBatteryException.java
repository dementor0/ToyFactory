package Exceptions;

public class DefectiveBatteryException extends RuntimeException {          // класс ошибки дефектной батарейки
    public DefectiveBatteryException(String message) {
        super(message);
    }
}

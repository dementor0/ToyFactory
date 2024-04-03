package Exceptions;

public class RotorBlockedException extends RuntimeException {          // класс ошибки блокировки ротора
    public RotorBlockedException(String message){
        super(message);
    }
}

package Exceptions;

public class EngineDamagedException extends RuntimeException {             // класс ошибки повреждения двигателя
    public EngineDamagedException(String message){
        super(message);
    }
}

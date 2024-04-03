package Exceptions;

public class AntennaException extends RuntimeException {  // класс ошибки при посылке серийного номера антенны
    public AntennaException(String message){
        super(message);
    }
}

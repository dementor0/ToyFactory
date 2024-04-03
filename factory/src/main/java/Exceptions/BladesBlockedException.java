package Exceptions;

public class BladesBlockedException extends RuntimeException {         // класс ошибки блокировки лопастей
    public BladesBlockedException(String message){
        super(message);
    }
}

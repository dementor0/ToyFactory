package components;

public interface IRemoteController {
    default void vibrate(){
        System.out.println("Издает вибрацию");
    }
    default void sendRequest(){
        System.out.println("Отправка широкополосного запроса");
    }
}

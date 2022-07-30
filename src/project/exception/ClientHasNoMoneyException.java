package project.exception;

public class ClientHasNoMoneyException extends Exception{
    public ClientHasNoMoneyException(String message) {
        super(message);
    }
}

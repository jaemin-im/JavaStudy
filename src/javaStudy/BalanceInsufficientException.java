package javaStudy;

/**
 * Created by dsm2017 on 2017-06-13.
 */
public class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException() {}
    public BalanceInsufficientException(String message) {
        super(message);
    }
}

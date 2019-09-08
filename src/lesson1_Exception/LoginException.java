package lesson1_Exception;

/**
 * @author sucre
 * @date 2019-09-08
 * @time 14:16
 * @description
 */
public class LoginException extends RuntimeException {
    public LoginException(String message) {
        super(message);
    }
}

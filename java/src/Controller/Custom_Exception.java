package Controller;

/**
 * Created by padawan on 3/26/14.
 */
public class Custom_Exception extends Exception{
    public Custom_Exception() {
    }

    public Custom_Exception(String message) {
        super(message);
    }

    public Custom_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Custom_Exception(Throwable cause) {
        super(cause);
    }

    public Custom_Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
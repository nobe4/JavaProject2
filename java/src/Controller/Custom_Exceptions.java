package Controller;

/**
 * Created by padawan on 3/26/14.
 */
public class Custom_Exceptions extends Exception{
    public Custom_Exceptions() {
    }

    public Custom_Exceptions(String message) {
        super(message);
    }

    public Custom_Exceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public Custom_Exceptions(Throwable cause) {
        super(cause);
    }

    public Custom_Exceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
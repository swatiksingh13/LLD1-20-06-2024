package in.scaler.lld1200624.lld1class13.checkedandunchecked;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        // Unchecked exception
        super(message);
    }
}

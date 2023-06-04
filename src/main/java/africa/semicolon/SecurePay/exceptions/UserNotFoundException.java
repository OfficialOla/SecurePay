package africa.semicolon.SecurePay.exceptions;

public class UserNotFoundException extends SecurePayException{
    public UserNotFoundException(String message) {
        super(message);
    }
}

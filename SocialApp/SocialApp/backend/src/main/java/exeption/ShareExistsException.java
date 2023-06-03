package exeption;



public class ShareExistsException extends RuntimeException {
    public ShareExistsException() {
    }

    public ShareExistsException(String message) {
        super(message);
    }
}
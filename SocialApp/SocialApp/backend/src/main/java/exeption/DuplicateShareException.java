package exeption;

public class DuplicateShareException extends RuntimeException {
    public DuplicateShareException() {
    }

    public DuplicateShareException(String message) {
        super(message);
    }
}
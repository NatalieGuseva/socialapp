package exeption;



public class TagExistsException extends RuntimeException {
    public TagExistsException() {
    }

    public TagExistsException(String message) {
        super(message);
    }
}
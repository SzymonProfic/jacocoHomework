package exceptions;

public class InsufficientNumberOfIngredientsException extends RuntimeException {
    public InsufficientNumberOfIngredientsException() {
    }

    public InsufficientNumberOfIngredientsException(String message) {
        super(message);
    }
}

package exceptions;

public class IncorrectPriceForGramException extends RuntimeException {
    public IncorrectPriceForGramException() {
    }

    public IncorrectPriceForGramException(String message) {
        super(message);
    }
}

package exceptions;

@SuppressWarnings("serial")
public class NonexistentKeyException extends Exception{

    public NonexistentKeyException(String message) {
        super(message);

    }
}

package exceptions;

import java.io.Serial;

public class InvalidAmountException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public InvalidAmountException() {
        super();
    }

    public InvalidAmountException(String msg) {
        super(msg);
    }
}

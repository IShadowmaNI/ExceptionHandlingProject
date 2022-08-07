package exceptions;

import java.io.Serial;

public class InsufficientFundsException extends Exception {

    @Serial
    private static final long serialVersionUID = 5682130214414595L;

    public InsufficientFundsException() {
        super();
    }

    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

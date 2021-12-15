package exception;

import java.util.function.Supplier;

public class InvalidNumberOfPeopleException extends RuntimeException {
    public InvalidNumberOfPeopleException(String message) {
        super(message);
    }

    public InvalidNumberOfPeopleException(Supplier<String> messageSupplier) {
        super(messageSupplier.get());
    }
}

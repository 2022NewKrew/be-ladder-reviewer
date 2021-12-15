package exception;

import java.util.function.Supplier;

public class InvalidHeightOfLadderException extends RuntimeException {
    public InvalidHeightOfLadderException(String message) {
        super(message);
    }

    public InvalidHeightOfLadderException(Supplier<String> messageSupplier) {
        super(messageSupplier.get());
    }
}

package homework_3.service.exceptions;

import java.io.IOException;

public class InputNotEnoughValuesException extends IOException {
    public InputNotEnoughValuesException(String message) {
        super(message);
    }
}

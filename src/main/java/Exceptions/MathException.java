package Exceptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MathException extends Exception {
    public MathException(String errorMessage) {
        log.info("Error appear at: " + java.time.LocalDate.now());
        log.info(errorMessage);
    }

}

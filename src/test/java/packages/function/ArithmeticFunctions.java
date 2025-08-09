package packages.function;

import java.util.logging.Logger;

import com.automation.services.LogService;

public class ArithmeticFunctions {
    private Logger logger = LogService.getLogger();

    public void checkNumberProperties(int number) {
        verifyEvenNumbers(number);
        verifyMultiple(number);
    }

    private void verifyMultiple(int number) {
        logger.config("this method not yet implemented");
        // TODO create method
    }

    private void verifyEvenNumbers(int number) {
        logger.finest("verifying number: " + number);
        boolean isEven = number % 2 == 0;
        String result = isEven ? "is even number" : "is odd number";
        logger.finer("the number: " + number + " " + result);
    }
}

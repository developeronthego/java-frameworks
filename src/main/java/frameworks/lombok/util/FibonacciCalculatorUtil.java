package frameworks.lombok.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class FibonacciCalculatorUtil {
    private final int FIRST_POSITION = 0;
    private final int SECOND_POSITION = 1;

    public int countValue(int position) {
        int previouspreviousNumber, previousNumber = FIRST_POSITION, currentNumber = SECOND_POSITION;

        for (int i = 1; i < position ; i++) {
            previouspreviousNumber = previousNumber;
            previousNumber = currentNumber;
            currentNumber = previouspreviousNumber + previousNumber;
        }
        return currentNumber;
    }
}

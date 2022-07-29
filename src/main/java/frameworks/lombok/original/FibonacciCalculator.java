package frameworks.lombok.original;

public final class FibonacciCalculator {
    private static final int FIRST_POSITION = 0;
    private static final int SECOND_POSITION = 1;

    private FibonacciCalculator() {
    }

    public static int countValue(int position) {
        int previouspreviousNumber, previousNumber = FIRST_POSITION, currentNumber = SECOND_POSITION;

        for (int i = 1; i < position ; i++) {
            previouspreviousNumber = previousNumber;
            previousNumber = currentNumber;
            currentNumber = previouspreviousNumber + previousNumber;
        }
        return currentNumber;
    }
}

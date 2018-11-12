public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstNumber, int lastNumber, char operation) {
        switch (operation) {
            case ADDITION:
                return  firstNumber + lastNumber;
            case SUBTRACTION:
                return firstNumber - lastNumber;
            case MULTIPLICATION:
                return firstNumber * lastNumber;
            case DIVISION:
                if (lastNumber != 0)
                    return firstNumber / lastNumber;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
package tasks;

public class task4 {
    public static int calculator(int number1, int number2, String str) {
        int sum = 0;
        if (str.equals("+")) {
            sum = number1 + number2;
        } else if (str.equals("-")) {
            sum = number1 - number2;
        } else if (str.equals("/")) {
            sum = number1 / number2;
        } else if (str.equals("*")) {
            sum = number1 * number2;
        }
        return sum;
    }
}

package tasks;

public class task2 {
    public static int factorial(int last) {
        int factorialnum = 1;
        for (int i = 1; i <= last; i++) {
            factorialnum *= i;
        }
        return factorialnum;
    }
}

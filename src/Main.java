import tasks.task1;
import tasks.task2;
import tasks.task3;
import tasks.task4;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = scanner.nextInt();
        System.out.println(task1.summ(1, n));
        System.out.println("Задача 2");
        System.out.println("Введите n: ");
        n = scanner.nextInt();
        System.out.println(task2.factorial(n));
        System.out.println("Задача 3");
        task3.even();
        System.out.println("Задача 4");
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите оператор: ");
        String str = scanner.next();
        System.out.println("ведите второе число: ");
        int number2 = scanner.nextInt();
        System.out.println(task4.calculator(number1, number2, str));

    }
}
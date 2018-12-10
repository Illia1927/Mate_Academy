package HomeWork1.HomeEx4;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("Введите переменную от которой вы хотите узнать число Фибоначчи : ");
        Scanner input = new Scanner(System.in);
        System.out.println("Число Фибоначчи от " + input.nextInt() + " равно : " + fibonacci(input.nextInt()));
    }

    static int fibonacci(int chislo) {
        if (chislo == 0) {
            return 0;
        } else if (chislo == 1) {
            return 1;
        } else {
            return (fibonacci(chislo - 1) + fibonacci(chislo - 2));
        }
    }
}

// Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Ведите первое число: ");
        double one = Integer.parseInt(scan.nextLine());

        System.out.printf("Ведите второе число: ");
        double two = Integer.parseInt(scan.nextLine());

        System.out.printf("Ведите знак операции (+ - * /): ");
        char sign = scan.next().charAt(0);
        scan.close();

        DoCalculate(one, two, sign);
    }

    public static void DoCalculate(double one, double two, char sign) {
        if (sign == '+') {
            System.out.printf("%.1f / %.1f = %.1f", one, two, one + two);
        } else if (sign == '-') {
            System.out.printf("%.1f / %.1f = %.1f", one, two, one - two);
        } else if (sign == '*') {
            System.out.printf("%.1f / %.1f = %.1f", one, two, one * two);
        } else if (sign == '/') {
            System.out.printf("%.1f / %.1f = %.1f", one, two, one / two);
        } else {
            System.out.printf("Знак операции введен неверно.");
        }
        return;
    }
}

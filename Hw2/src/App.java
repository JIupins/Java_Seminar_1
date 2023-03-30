// Вычислить n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scan.nextInt();
        scan.close();

        System.out.printf("Произведениек числел от 1 до %d равно %d.", num, FindFactorial(num));
    }

    public static int FindFactorial(int num) {
        if (num == 1)
            return 1;
        else
            return num * FindFactorial(num - 1);
    }
}

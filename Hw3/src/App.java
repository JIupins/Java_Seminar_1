// Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)

public class App {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (FindSimpleNumber(i))
                System.out.print(i + ", ");
            else
                continue;
        }
    }

    public static boolean FindSimpleNumber(int num) {
        if (num == 1) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num == 1 || num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

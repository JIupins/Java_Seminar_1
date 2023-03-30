

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scan.nextInt();
        scan.close();
        
        System.out.printf("Сумма числел от 1 до %d равна %d.", num ,FindNumber(num));
    }

    public static int FindNumber(int num){
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum +=i;
        }
        return sum;
    }
}

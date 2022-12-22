import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любые 6 чисел для массива");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        boolean output = false;
        for (int x:numbers) {
            if (x % 3 ==0) {
                System.out.print(x + " ");
                output = true;
            }
        }
        if(!output){
            System.out.println("Вы не ввели числа, кратные 3");
        }
    }
}
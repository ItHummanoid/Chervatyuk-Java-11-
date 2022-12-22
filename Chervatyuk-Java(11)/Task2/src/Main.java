import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String string1 = "Вячеслав";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое имя");
        String string2 = scanner.nextLine();
        if(string1.equals(string2)) {
            System.out.println("Привет, " + string2);
        } else {
            System.out.println("Нет такого имени");
        }

    }
}
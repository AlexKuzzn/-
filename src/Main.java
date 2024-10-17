import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числовых значения по очереди:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double answer;
        System.out.println("Нажмите +, чтобы сложить числа");
        String sign = scanner.next();
        switch (sign) {
            case "+":
                answer = a+b;
                System.out.println("Сумма чисел равна " + answer);
                break;
            default:
                System.out.println("Ошибка!");
        }
    }
}
import java.rmi.server.Operation;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("введите 2 целых числа: ");
        int a = 0;
        int b = 0;
        String operation = null;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        operation = scanner.next();
        b = scanner.nextInt();
        if (operation.equals("+")) {
            int c = a + b;
        System.out.println("ответ:" +c);
        }
        if (operation.equals("-")) {
            int c = a - b;
        System.out.println("ответ:" +c);
        }
        if (operation.equals("*")) {
            int c = a * b;
            System.out.println("ответ:" +c);
        }
        if (operation.equals("/")) {
            int c = a / b;
            System.out.println("ответ:" +c);
        }
    }
}



package Controller;

import java.util.Scanner;

public class ConsoleScannerImpl implements ConsoleScanner {
    Scanner scanner;

    @Override
    public double number(String message) {
        Integer temp = 0;
        scanner = new Scanner(System.in);
        String a;
        while (true) {
            System.out.println(message);
            a = scanner.next();
            try {
                temp = Integer.parseInt(a);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели неверный тип данных");
            }
        }
        double result = temp.doubleValue();
        return result;
    }
}

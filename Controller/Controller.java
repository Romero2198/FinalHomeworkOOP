package Controller;

import Logger.Logger;
import Model.*;
import UI.OutImpl;

public class Controller implements Control{
    private double aF;
    private double iF;
    private double aS;
    private double iS;
    private ComplexNumber numberA;
    private ComplexNumber numberB;
    private double[] temp;
    @Override
    public void program() {
        ConsoleScannerImpl getter = new ConsoleScannerImpl();
        GetSign sign = new GetSign();
        OutImpl out = new OutImpl();
        Add adder = new Add();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        Logger logger = new Logger();
        boolean end = true;
        while (end) {
            aF = getter.number("Введите вещественную часть первого комплексного числа: ");
            iF = getter.number("Введите мнимую часть первого комплексного числа: ");
            aS = getter.number("Введите вещественную часть второго комплексного числа: ");
            iS = getter.number("Введите мнимую часть второго комплексного числа: ");
            numberA = new ComplexNumber(aF, iF);
            numberB = new ComplexNumber(aS, iS);
            logger.update(numberA, "Первое число: ");
            logger.update(numberB, "Второе число: ");

            switch (sign.getSign("Введите математическую операцию: '+' , '-' , '*', '/'")) {
                case "+" -> {
                    temp = adder.operate(numberA, numberB);
                    out.print(new ComplexNumber(temp[0], temp[1]));
                }
                case "-" -> {
                    temp = subtraction.operate(numberA, numberB);
                    out.print(new ComplexNumber(temp[0], temp[1]));
                }
                case "*" -> {
                    temp = multiplication.operate(numberA, numberB);
                    out.print(new ComplexNumber(temp[0], temp[1]));
                }
                case "/" -> {
                    temp = division.operate(numberA, numberB);
                    out.print(new ComplexNumber(temp[0], temp[1]));
                }

            }
            switch (sign.getSign("Продолжить работу программы: Y/N")) {
                case "Y" -> {
                }
                case "N" -> {
                    end = false;
                }
            }
        }

    }
}

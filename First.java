package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        char c = scanner.next().charAt(0);
        double b = scanner.nextDouble();
        if (c == '+') {
            System.out.println(Func1(a, b));
        }
        else if (c == '-'){
            System.out.println(Func2(a, b));
        }
        else if (c == '*') {
            System.out.println(Func3(a, b));
        }
        else if (c == '/'){
            System.out.println(Func4(a, b));
        }
        else {
            System.out.println("Вы ввели неверный арифметический оператор");
        }
    }
    public static double Func1(double a, double b) {
        return a + b;
    }
    public static double Func2(double a, double b) {
        return a - b;
    }
    public static double Func3(double a, double b) {
        return a * b;
    }
    public static double Func4(double a, double b) {
        if (b != 0){
            return a / b;
        }
        else {
            System.out.println("Error");
            return 0;
        }
    }
}
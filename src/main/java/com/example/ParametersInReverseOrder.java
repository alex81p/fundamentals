package com.example;

// 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

public class ParametersInReverseOrder {
    public static void main(String[] args) {
        if (args != null && args.length > 1){
            System.out.print("The arguments displayed in reverse order: ");
            for (int i = args.length-1; i >= 0; i--) {
                System.out.print(args[i] + " ");
            }
        } else {
            System.out.println("Run the program with two or more parameters.");
        }
    }
}

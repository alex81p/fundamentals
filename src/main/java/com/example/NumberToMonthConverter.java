package com.example;

import java.util.Scanner;

// 5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
// Осуществить проверку корректности ввода чисел.

public class NumberToMonthConverter {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int monthNumber = 1;
        boolean monthNumberIsValid = false;
        do {
            System.out.print("Enter an integer from 1 to 12: ");
            try {
                Scanner scanner = new Scanner(System.in);
                monthNumber = scanner.nextInt();
                if (monthNumber < 1 || monthNumber > 12) {
                    throw new Exception();
                }
                monthNumberIsValid = true;
            } catch (Exception e) {
                System.out.println("Try again.");
            }
        } while (!monthNumberIsValid);
        System.out.printf("That's %s.", months[monthNumber-1]);
    }
}

package com.example;

import java.util.Scanner;

// 1. Приветствовать любого пользователя при вводе его имени через командную строку.

public class Greeting {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("\nHello, " + userName);
    }
}

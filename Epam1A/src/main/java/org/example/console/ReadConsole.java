package org.example.console;

import java.util.Scanner;

public class ReadConsole {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInteger() {
        int num = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                break;
            } else {
                System.err.println("Введите цифру");
                scanner.nextLine();
            }
        }
        return num;
    }

    public static Long getLong() {
        Long num = 0L;
        while (true) {
            if (scanner.hasNextLong()) {
                num = scanner.nextLong();
                break;
            } else {
                System.err.println("Введите цифру");
                scanner.nextLine();
            }
            scanner.nextLine();
        }
        return num;
    }

    public static String detStringLine() {
        return scanner.next();
    }
}
package org.example.epam1B.console;

import java.util.Scanner;

public class ReadConsole {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInteger() {
        int line = 0;
        while (true) {
          if (scanner.hasNextInt())  {
              line =scanner.nextInt();
              break;
          } else {
              scanner.nextLine();
              System.err.println("Введите цифру");
          }
        }
        return line;
    }
}
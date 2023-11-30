package org.example.task;

import org.example.console.ReadConsole;

/*
2. Отобразить в окне консоли аргументы командной строки в обратном по-
рядке.
 */
public class Task2 extends Task {
    @Override
    public void task() {
        while (true) {
            System.out.println("Введите аргумент или 0 для выхода");
            char[] line = ReadConsole.detStringLine().toCharArray();
            System.out.println("Вывод в обратном порядке.");
            for (int i = line.length; i > 0; i--) {
                System.out.print(line[i - 1]);
            }
            System.out.println();
        }
    }
}
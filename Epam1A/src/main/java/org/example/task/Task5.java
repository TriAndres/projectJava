package org.example.task;

import org.example.console.ReadConsole;

/*
5. Ввести целые числа как аргументы командной строки, подсчитать их сум-
мы и произведения. Вывести результат на консоль.
 */
public class Task5 extends Task{
    @Override
    public void task() {
        int sum = 0;
        int mull = 1;
        while (true) {
            System.out.println("Введите целые числа или 0 для выхода:");
            int num = ReadConsole.getInteger();
            if (num == 0) break;
            sum += num;
            System.out.println("Сумма: " + sum);
            mull *= num;
            System.out.println("Произведение: " + mull);
        }
    }
}
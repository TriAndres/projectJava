package org.example.task;

import org.example.console.ReadConsole;
import org.example.interfeces.BoolAction1;

import java.util.Random;

/*
3. Вывести заданное количество случайных чисел с переходом и без перехода
на новую строку.
 */
public class Task3 extends Task{
    private int[] number;
    @Override
    public void task() {
        while (true) {
            System.out.println("Введите количество случайных чисел или -1 для выхода");
            int num = ReadConsole.getInteger();
            if (num == -1) break;
            initArray(num);
            setRandomNum(1,100);
            System.out.println("С переходом");
            show(a -> a % 10 == 0 );
            System.out.println("Без перехода");
            show(a -> a == 0 );
        }
        System.out.println("Вышли из программы");
    }

    public void initArray(int num) {
        number = new int[num];
    }

    public void setRandomNum(int from, int to) {
        for (int i = 0; i < number.length; i++) {
            number[i] = from + new Random().nextInt(to - from);
        }
    }

    public void show(BoolAction1 action) {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "\t");
            count++;
            if (action.action(count)) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println();
    }
}
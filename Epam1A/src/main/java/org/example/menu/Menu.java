package org.example.menu;

import org.example.console.ReadConsole;
import org.example.factory.FactoryTask;

public class Menu {
    private final FactoryTask factoryTask;

    public Menu() {
        factoryTask = new FactoryTask();
    }

    public void game() {
        while (true) {
            menu();
            int command = ReadConsole.getInteger();
            if (command == 0) break;
            select(command);
        }
        System.out.println("Удачно вышли из программы");
    }
    public void menu() {
        System.out.println("\t\nВыбирите действие:" +
                "\n\t1. Приветствовать любого пользователя при вводе его имени через команд-" +
                "\n\t\tную строку." +
                "\n\t2. Отобразить в окне консоли аргументы командной строки в обратном по-" +
                "\n\t\tрядке." +
                "\n\t3. Вывести заданное количество случайных чисел с переходом и без перехода" +
                "\n\t\tна новую строку." +
                "\n\t4. Ввести пароль из командной строки и сравнить его со строкой-образцом." +
                "\n\t5. Ввести целые числа как аргументы командной строки, подсчитать их сум-" +
                "\n\t\tмы и произведения. Вывести результат на консоль." +
                "\n\t6. Вывести фамилию разработчика, дату и время получения задания, а также" +
                "\n\t\tдату и время сдачи задания." +
                "\n\t0. Выход."
        );
    }

    public void select(int command) {
        switch (command) {
            case 1:
                factoryTask.task1();
                break;
            case 2:
                factoryTask.task2();
                break;
            case 3:
                factoryTask.task3();
                break;
            case 4:
                factoryTask.task4();
                break;
            case 5:
                factoryTask.task5();
                break;
            case 6:
                factoryTask.task6();
                break;
            default:
                System.out.println("Kоманды такой нет!");
                break;
        }
    }
}
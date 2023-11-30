package org.example.task;

import org.example.console.ReadConsole;

/*
1. Приветствовать любого пользователя при вводе его имени через команд-
ную строку.
 */
public class Task1 extends Task{
    @Override
    public void task() {
        while (true) {
            System.out.println("Введите ваше имя или 0 для выхода");
            String name = ReadConsole.detStringLine();
            if (name.equals("0")) break;
            System.out.println(name + ", вас приветствую!");
        }
        System.out.println("Вышли из программы.");
    }
}
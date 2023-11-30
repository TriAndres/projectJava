package org.example.task;

import org.example.console.ReadConsole;

/*
4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
 */
public class Task4 extends Task{
    @Override
    public void task() {
        String password = "пароль";
        while (true) {
            System.out.println("Введите пароль или 0 для выхода");
            String line = ReadConsole.detStringLine();
            if (line.equals("0")) break;
            if (password.equals(line)) {
                System.out.println(password + " - вели правильно!");
                break;
            }
        }
        System.out.println("Вышли из программы.");
    }
}
package org.example.factory;

import org.example.begin.Numbers;
import org.example.console.ReadConsole;
import org.example.manage.ManageNumbers;

import java.util.Random;

public class FactoryNumbers {
    private ManageNumbers manageNumbers;
    private Random random = new Random();

    public FactoryNumbers(ManageNumbers manageNumbers) {
        this.manageNumbers = manageNumbers;
    }

    public void add() {
        System.out.println("Введите цифру:");
        int num = 0;
        while (true) {
            num = ReadConsole.getInteger();
            if (num > -1) {
                break;
            } else {
                System.err.println("Введите положительную цифру.");
            }
        }
        manageNumbers.add(new Numbers(Integer.toString(num)));
        System.out.println("Записано.");
    }

    public void set() {
        System.out.println("Введите id цифры для замены");
        int id = 0;
        while (true) {
            id = ReadConsole.getInteger();
            if (id > -1) {
                break;
            } else {
                System.err.println("Введите положительную цифру.");
            }
        }
        System.out.println("Введите цифру:");
        int num = 0;
        while (true) {
            num = ReadConsole.getInteger();
            if (num > -1) {
                break;
            } else {
                System.err.println("Введите положительную цифру.");
            }
        }
        manageNumbers.set(id, new Numbers(Integer.toString(num)));
        System.out.println("Записано.");
    }
    
    public void addList() {
        System.out.println("Введиде количество цифр:");
        int num = 0;
        while (true) {
            num = ReadConsole.getInteger();
            if (num > -1) {
                break;
            } else {
                System.err.println("Введите положительную цифру.");
            }
        }

        System.out.println("Введиде диапазон цифр ОТ:");
        int from = 0;
        while (true) {
            from = ReadConsole.getInteger();
            if (from > -1) {
                break;
            } else {
                System.err.println("Введите положительную цифру.");
            }
        }

        System.out.println("Введиде диапазон цифр ДО:");
        int to = 0;
        while (true) {
            to = ReadConsole.getInteger();
            if (to > from) {
                break;
            } else {
                System.err.println("Введите цифру, больше ОТ.");
            }
        }


        for (int i = 0; i < num; i++) {
            manageNumbers.add(new Numbers(Integer.toString(random.nextInt(to - from) + from)));
        }
        System.out.println("Записано.");
    }

    public void show() {
        int count = 0;
        for (Numbers numbers : manageNumbers.getArrayList()) {
            System.out.print(numbers.getId() + "-" + numbers.getNum() + "\t");
            count++;
            if (count % 10 == 0) System.out.println();
        }
    }

    public void clear() {
        manageNumbers.clear();
        System.out.println("Список очищен.");
    }
}

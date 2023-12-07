package org.example.epam1B.factory;

import org.example.epam1B.begin.Numbers;
import org.example.epam1B.console.ReadConsole;
import org.example.epam1B.manage.ManageNumbers;
/*
Ввести с консоли n целых чисел. На консоль вывести:
 */
public class FactoryNumbers {
    private ManageNumbers manageNumbers;

    public FactoryNumbers(ManageNumbers manageNumbers) {
        this.manageNumbers = manageNumbers;
    }

    public void add() {
        System.out.println("Введите цифру:");
        manageNumbers.add(new Numbers(Integer.toString(ReadConsole.getInteger())));
        System.out.println("Записано.");
    }

    public void set() {
        if (!manageNumbers.getArrayList().isEmpty()) {
            System.out.println("Введите id цифры для замены ");
            int num = 0;
            while (true) {
                num = ReadConsole.getInteger();
                if (num >= 1 && num <= manageNumbers.getArrayList().size()) {
                    System.out.println("Введите цифру:");
                    manageNumbers.set(Integer.toString(num), Integer.toString(ReadConsole.getInteger()));
                    System.out.println("Записано.");
                    break;
                } else {
                    System.out.println("Диапазон ввода от 1 до " + manageNumbers.getArrayList().size());
                }
            }
        } else {
            System.out.println("Список пуст, выполните команду 1 - добавить.");
        }
    }

    public void clear() {
        manageNumbers.getArrayList().clear();
    }
    public void show() {
        if (!manageNumbers.getArrayList().isEmpty()) {
            for (Numbers num : manageNumbers.getArrayList()) {
                System.out.println("id-" + num.getId() + ", num-" + num.getNum());
            }

        } else {
            System.out.println("Список пуст, выполните команду 1 - добавить.");
        }
    }
}
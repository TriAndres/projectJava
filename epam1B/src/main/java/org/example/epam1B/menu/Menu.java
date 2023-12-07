package org.example.epam1B.menu;

import org.example.epam1B.console.ReadConsole;
import org.example.epam1B.factory.FactoryNumbers;
import org.example.epam1B.factory.FactoryTask;
import org.example.epam1B.manage.ManageNumbers;

public abstract class Menu {
    protected FactoryNumbers factoryNumbers;
    protected FactoryTask factoryTask;

    public Menu(ManageNumbers manageNumbers) {
    }

    protected Menu() {
    }

    public void game() {
        while (true) {
            menu();
            int num = ReadConsole.getInteger();
            if (num == 0) break;
            select(num);
        }
        System.out.println("вышли из меню");
    }

    public abstract void menu();

    public abstract void select(int num);
}
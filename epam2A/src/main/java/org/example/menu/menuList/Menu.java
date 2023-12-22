package org.example.menu.menuList;

import org.example.console.ReadConsole;
import org.example.factory.FactoryNumbers;
import org.example.factory.FactoryTask;
import org.example.manage.ManageNumbers;


public abstract class Menu {
    protected ManageNumbers manageNumbers;
    protected FactoryNumbers factoryNumbers;
    protected FactoryTask factoryTask;


    public Menu(ManageNumbers manageNumbers) {
        this.manageNumbers = manageNumbers;
        factoryNumbers = new FactoryNumbers(manageNumbers);
        factoryTask = new FactoryTask(manageNumbers);
    }
    public void game() {
        while (true) {
            menu();
            int comanda = ReadConsole.getInteger();
            if (comanda == 0) {
                System.out.println("Вышли из меню");
                break;
            }
            select(comanda);
        }
    }

    public abstract void menu();

    public abstract   void select(int comanda) ;
}

package org.example.menu;

import org.example.console.ReadConsole;
import org.example.file.WriteReadFile;
import org.example.manage.ManageNumbers;
import org.example.menu.menuList.MenuNumbers;
import org.example.menu.menuList.MenuTask;

public class MenuMain {
    private WriteReadFile wr;
    private ManageNumbers manageNumbers;
    private MenuNumbers menuNumbers;
    private MenuTask menuTask;

    public MenuMain() {
        wr = new WriteReadFile();
        manageNumbers = new ManageNumbers();
        menuNumbers = new MenuNumbers(manageNumbers);
        menuTask = new MenuTask(manageNumbers);
    }

    public void game() {
        manageNumbers.getFile(wr);
        System.out.println("Зашли в приложение.");
        while (true) {
            menu();
            int comanda = ReadConsole.getInteger();
            if (comanda == 0) {
                System.out.println("Вышли из рограммы");
                break;
            }
            select(comanda);
        }
        manageNumbers.setFile(wr);
    }


    private void menu() {
        System.out.println("\n\tВыбирите действие:" +
                "\n\t1 - меню манипуляция цифр" +
                "\n\t2 - меню задач" +
                "\n\t0 - выход из программы");
    }

    private void select(int comanda) {
        if (comanda <= 2) System.out.println("Выполняется команда: " + comanda);
        switch (comanda) {
            case 1:
                menuNumbers.game();
                break;
            case 2:
                menuTask.game();
                break;
            default:
                System.err.println("ведите диапозон от 0 до 2");
                break;
        }
    }
}

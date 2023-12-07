package org.example.epam1B.menu;

import org.example.epam1B.console.ReadConsole;
import org.example.epam1B.file.FileWritOrRead;
import org.example.epam1B.manage.ManageNumbers;

public class MenuMain {
    private ManageNumbers manageNumbers;
    private FileWritOrRead fileWritOrRead;

    public MenuMain() {
        manageNumbers = new ManageNumbers();
        fileWritOrRead = new FileWritOrRead();
    }
    public void game() {
        while (true) {
            manageNumbers.setArrayList(fileWritOrRead.getFileReader());
            menu();
            int num = ReadConsole.getInteger();
            if (num == 0) break;
            select(num);
            fileWritOrRead.setFileWrite(manageNumbers.getArrayList());
        }
        System.out.println("вышли из меню");
    }

    private void menu() {
        System.out.println("\n\tВыбирите действие:" +
                "\n\t1 - меню списка цифр" +
                "\n\t2 - меню задач" +
                "\n\t0 - выход"
        );
    }

    private void select(int num) {
        switch (num) {
            case 1:
                new MenuNumber(manageNumbers).game();
                //menuNumber.game();
                break;
            case 2:
                new MenuTask(manageNumbers).game();
                //menuTask.game();
                break;
            default:
                System.err.println("Неверный формат ввода");
                break;
        }
    }
}
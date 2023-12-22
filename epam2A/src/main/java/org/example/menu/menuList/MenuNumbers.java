package org.example.menu.menuList;

import org.example.manage.ManageNumbers;

public class MenuNumbers extends Menu {


    public MenuNumbers(ManageNumbers manageNumbers) {
        super(manageNumbers);
    }

    public void menu() {
        System.out.println("\n\tВыбирите действие:" +
                "\n\t1 - добавить цифру" +
                "\n\t2 - заменить цифру" +
                "\n\t3 - добавить список цифр" +
                "\n\t4 - показать весь список" +
                "\n\t5 - удалить весь список" +
                "\n\t0 - записать/выход из этого меню");
    }

    public void select(int comanda) {
        if (comanda <= 5) System.out.println("Выполняется команда: " + comanda);
        switch (comanda) {
            case 1:
                factoryNumbers.add();
                break;
            case 2:
                factoryNumbers.set();
                break;
            case 3:
                factoryNumbers.addList();
                break;
            case 4:
                factoryNumbers.show();
                break;
            case 5:
                factoryNumbers.clear();
                break;
            default:
                System.err.println("ведите диапозон от 0 до 4");
                break;
        }
    }
}

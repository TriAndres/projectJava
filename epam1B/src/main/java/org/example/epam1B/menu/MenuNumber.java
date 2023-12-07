package org.example.epam1B.menu;

import org.example.epam1B.factory.FactoryNumbers;
import org.example.epam1B.manage.ManageNumbers;

public class MenuNumber extends Menu{
    private final FactoryNumbers factoryNumbers;

    public MenuNumber(ManageNumbers manageNumbers) {
        factoryNumbers = new FactoryNumbers(manageNumbers);
    }

    public void menu() {
        System.out.println("\n\tВыбирите действие:" +
                "\n\t1 - добавить" +
                "\n\t2 - изменить" +
                "\n\t3 - очистить" +
                "\n\t4 - показать" +
                "\n\t0 - сохранить и выход"
        );
    }

    public void select(int num) {
        switch (num) {
            case 1:
                factoryNumbers.add();
                break;
            case 2:
                factoryNumbers.set();
                break;
            case 3:
                factoryNumbers.clear();
                break;
            case 4:
                factoryNumbers.show();
                break;
            default:
                System.err.println("Неверный формат ввода");
                break;
        }
    }
}
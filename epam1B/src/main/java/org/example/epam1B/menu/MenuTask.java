package org.example.epam1B.menu;

import org.example.epam1B.factory.FactoryTask;
import org.example.epam1B.manage.ManageNumbers;

public class MenuTask extends Menu{


    private final FactoryTask factoryTask;

    public MenuTask(ManageNumbers manageNumbers) {
        factoryTask = new FactoryTask(manageNumbers);

    }

    public void menu() {
        System.out.println("\n\tВыбирите действие:" +
                "\n\t 1 - задача N1" +
                "\n\t 2 - задача N2" +
                "\n\t 3 - задача N3" +
                "\n\t 4 - задача N4" +
                "\n\t 5 - задача N5" +
                "\n\t 6 - задача N6" +
                "\n\t 7 - задача N7" +
                "\n\t 8 - задача N8" +
                "\n\t 9 - задача N9" +
                "\n\t10 - задача N10" +
                "\n\t11 - задача N11" +
                "\n\t12 - выход"
        );
    }

    public void select(int num) {
        switch (num) {
            case 1:
                factoryTask.task1();
                break;
            case 2:
                factoryTask.task2();
                break;
            case 3:
                factoryTask.task3();
                break;
            case 4:
                factoryTask.task4();
                break;
            case 5:
                factoryTask.task5();
                break;
            case 6:
                factoryTask.task6();
                break;
            case 7:
                factoryTask.task7();
                break;
            case 8:
                factoryTask.task8();
                break;
            case 9:
                factoryTask.task9();
                break;
            case 10:
                factoryTask.task10();
                break;
            case 11:
                factoryTask.task11();
                break;
            default:
                System.err.println("Неверный формат ввода");
                break;
        }
    }
}
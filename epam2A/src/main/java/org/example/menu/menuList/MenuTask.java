package org.example.menu.menuList;

import org.example.manage.ManageNumbers;

public class MenuTask extends Menu {

    public MenuTask(ManageNumbers manageNumbers) {
        super(manageNumbers);
    }

    @Override
    public void menu() {
        System.out.println("\n\tВыбирите действие:" +
                "\n\t1 - N1 задача" +
                "\n\t2 - N2 задача" +
                "\n\t3 - N3 задача" +
                "\n\t4 - N4 задача" +
                "\n\t5 - N5 задача" +
                "\n\t6 - N6 задача" +
                "\n\t7 - N7 задача" +
                "\n\t8 - N8 задача" +
                "\n\t9 - N9 задача" +
                "\n\t0 - выход из этого меню");
    }

    @Override
    public void select(int comanda) {
        if (comanda <= 9) System.out.println("Выполняется задача: " + comanda);
        switch (comanda) {
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
            default:
                System.err.println("Введите в формате от 0 до 9.");

        }
    }
}

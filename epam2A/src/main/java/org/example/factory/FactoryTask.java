package org.example.factory;

import org.example.manage.ManageNumbers;
import org.example.task.*;

public class FactoryTask {
    private ManageNumbers manageNumbers;
    private Task task;

    public FactoryTask(ManageNumbers manageNumbers) {
        this.manageNumbers = manageNumbers;

    }

    public void task1() {
        task = new Task1(manageNumbers.getArrayList());
        task.task();
    }

    public void task2() {
        task = new Task2(manageNumbers.getArrayList());
    }

    public void task3() {
        task = new Task3(manageNumbers.getArrayList());
    }

    public void task4() {
        task = new Task4(manageNumbers.getArrayList());
    }

    public void task5() {
        task = new Task5(manageNumbers.getArrayList());
    }

    public void task6() {
        task = new Task6(manageNumbers.getArrayList());
    }

    public void task7() {
        task = new Task7(manageNumbers.getArrayList());
    }

    public void task8() {
        task = new Task8(manageNumbers.getArrayList());
    }

    public void task9() {
        task = new Task9(manageNumbers.getArrayList());
    }
}

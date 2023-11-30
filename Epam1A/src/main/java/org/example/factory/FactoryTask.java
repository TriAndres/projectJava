package org.example.factory;

import org.example.task.*;


public class FactoryTask {
    private Task task;
    public void task1() {
        task = new Task1();
        task.task();
    }

    public void task2() {
        task = new Task2();
        task.task();
    }

    public void task3() {
        task = new Task3();
        task.task();
    }

    public void task4() {
        task = new Task4();
        task.task();
    }

    public void task5() {
        task = new Task5();
        task.task();
    }

    public void task6() {
        task = new Task6();
        task.task();
    }
}
package org.example.epam1B.task;

import org.example.epam1B.begin.Numbers;

import java.util.ArrayList;

public abstract class Task {
    protected ArrayList<Numbers> arrayList;

    public Task(ArrayList<Numbers> arrayList) {
        this.arrayList = arrayList;
    }

    public abstract void task();

    public void showNumber(int lineLength) {
        int count = 0;
        for (Numbers numbers : arrayList) {
            if (numbers.isBoolAction()) {
                System.out.println(Integer.parseInt(numbers.getId()) + "-" + Integer.parseInt(numbers.getNum()) + "\t");
                count++;
                if (count % lineLength == 0) System.out.println();
            }
        }
        System.out.println();
    }
}
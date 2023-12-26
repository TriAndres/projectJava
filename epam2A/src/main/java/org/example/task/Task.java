package org.example.task;

import org.example.begin.Numbers;

import java.util.ArrayList;

public abstract class Task {
    protected ArrayList<Numbers> arrayList;
    public Task(ArrayList<Numbers> arrayList) {
        this.arrayList = arrayList;
    }
    public abstract void task();

    public void setNumLength() {
        for (Numbers numbers : arrayList) {
            int numLength = numbers.getNum().length();
            numbers.setNumLength(numLength);
        }
    }
}
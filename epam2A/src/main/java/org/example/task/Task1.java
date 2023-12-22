package org.example.task;

import org.example.begin.Numbers;
import java.util.ArrayList;

/*
1. Найти самое короткое и самое длинное число. Вывести найденные числа
и их длину.
 */
public class Task1 extends Task {


    public Task1(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        System.out.println("1. Найти самое короткое и самое длинное число. " +
                "Вывести найденные числа и их длину.");
        setNumLength();
        sortNumLength();

        System.out.println("самое короткое число: " + arrayList.get(0).getNumLength() + "-" + arrayList.get(0).getNum());
        System.out.println("самое длинное число: " + arrayList.get(arrayList.size()-1).getNumLength() + "-" + arrayList.get(arrayList.size()-1).getNum());

        sortNumId();
    }

    public void setNumLength() {
        for (Numbers numbers : arrayList) {
            int numLength = numbers.getNum().length();
            numbers.setNumLength(numLength);
        }
    }

    public void sortNumLength() {
        arrayList.sort((a, b) -> a.getNumLength() - b.getNumLength());
    }
    public void sortNumId() {
        arrayList.sort((a, b) -> Integer.parseInt(a.getId()) - Integer.parseInt(b.getId()));
    }

}
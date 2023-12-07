package org.example.epam1B.task;

import org.example.epam1B.begin.Numbers;
import org.example.epam1B.interfices.BoolAble1;

import java.util.ArrayList;

/*
1. Четные и нечетные числа.
 */
public class Task1 extends Task{

    public Task1(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        System.out.println("1. Четные и нечетные числа.");
        System.out.println("Четные числа:");
        numberAction(i -> i % 2 == 0);
        showNumber(10);
        System.out.println("Нечетные числа:");
        numberAction(i -> i % 2 != 0);
        showNumber(10);
    }

    public void numberAction(BoolAble1 action) {
        for (Numbers numbers : arrayList) {
            if (action.action(Integer.parseInt(numbers.getNum()))) {
                numbers.setBoolAction(true);
            } else {
                numbers.setBoolAction(false);
            }
        }
    }
}
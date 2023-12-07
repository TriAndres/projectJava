package org.example.epam1B.task;

import org.example.epam1B.begin.Numbers;
import org.example.epam1B.interfices.BoolAble1;

import java.util.ArrayList;

/*
4. Числа, которые делятся на 5 и на 7.
 */
public class Task4 extends Task{
    public Task4(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        System.out.println("Числа, делятся на 5 и на 7:");
        numberAction(i -> i % 5 == 0 && i % 7 == 0);
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
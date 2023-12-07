package org.example.epam1B.task;

import org.example.epam1B.begin.Numbers;
import org.example.epam1B.interfices.BoolAble1;

import java.util.ArrayList;

/*
3. Числа, которые делятся на 3 или на 9.
 */
public class Task3 extends Task{
    public Task3(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        System.out.println("Числа, делятся на 3 или на 9:");
        numberAction(i -> i % 3 == 0);
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
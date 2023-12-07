package org.example.epam1B.task;

import org.example.epam1B.begin.Numbers;
import org.example.epam1B.interfices.BoolAble2;

import java.util.ArrayList;

/*
2. Наибольшее и наименьшее число.
 */
public class Task2 extends Task{
    public Task2(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        System.out.println("Наибольшее число:");
        number(arrayList, 0, (a, b) ->  a < b);

        System.out.println("Наименьшее число:");
        number(arrayList, 100_000, (a, b) ->  a > b);
    }

    public void number(ArrayList<Numbers> arrayList, int num, BoolAble2 action) {
        for (Numbers numbers : arrayList) {
            if (action.action(num, Integer.parseInt(numbers.getNum()))) {
                num = Integer.parseInt(numbers.getNum());
            }
        }
        System.out.println(num);
    }
}
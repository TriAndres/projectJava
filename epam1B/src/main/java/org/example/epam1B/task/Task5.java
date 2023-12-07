package org.example.epam1B.task;

import org.example.epam1B.begin.Numbers;
import org.example.epam1B.interfices.BoolAble3;

import java.util.ArrayList;

/*
5. Все трехзначные числа, в десятичной записи которых нет одинаковых
цифр.
 */
public class Task5 extends Task{
    public Task5(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        System.out.println("Все трехзначные числа, в которых нет одинаковых цифр:");
        numberAction((a,b,c) -> !a.equals(b) && !b.equals(c) && !c.equals(a));
        showNumber(10);
    }

    public void numberAction(BoolAble3 action) {
        for (Numbers numbers : arrayList) {
            char[] line = numbers.getNum().toCharArray();
            if (line.length == 3) {
                if (action.action(String.valueOf(line[0]), String.valueOf(line[1]), String.valueOf(line[2]))) {
                    numbers.setBoolAction(true);
                } else {
                    numbers.setBoolAction(false);
                }
            }
        }
    }
}
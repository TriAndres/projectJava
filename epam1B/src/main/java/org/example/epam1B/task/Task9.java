package org.example.epam1B.task;

import org.example.epam1B.begin.Numbers;
import org.example.epam1B.interfices.BoolAble2;

import java.util.ArrayList;

/*
9. «Счастливые» числа.

 Счастливым будет считаться такое число из шести цифр,
 в котором сумма левых трех цифр равна сумме правых трех,
  например: 457961:4+5+5=9+6+1=16. найдите все счастливые
  числа в интервале от 100000 до 999999и подсчитать их количество.
 */
public class Task9 extends Task{
    public Task9(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        System.out.println("Счастливые» числа:");
        numberAction();
        showNumber(10);
    }

    public void numberAction() {
        for (int i = 0; i < arrayList.size(); i++) {
            char[] line = Integer.toString(Integer.parseInt(arrayList.get(i).getNum())).toCharArray();
            if (line.length == 6) {
                if ((Integer.parseInt(String.valueOf(line[0])) + Integer.parseInt(String.valueOf(line[1])) +
                        Integer.parseInt(String.valueOf(line[2])))  == (Integer.parseInt(String.valueOf(line[3])) +
                        Integer.parseInt(String.valueOf(line[4])) + Integer.parseInt(String.valueOf(line[5])))) {
                    arrayList.get(i).setBoolAction(true);
                } else {
                    arrayList.get(i).setBoolAction(false);
                }
            }
        }
    }
}
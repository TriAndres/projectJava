package org.example.epam1B.task;

import org.example.epam1B.begin.Numbers;
import org.example.epam1B.interfices.BoolAble1;
import org.example.epam1B.interfices.BoolAble2;

import java.util.ArrayList;

/*
6. Простые числа.
 */
public class Task6 extends Task{
    public Task6(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        System.out.println("Простые числа");
        numberAction((a,b) -> a % b == 0 );
        showNumber(10);
    }

    public void numberAction(BoolAble2 action) {
        boolean flag = true;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 2; j < Integer.parseInt(arrayList.get(i).getNum()); j++) {
                flag = true;
                if ((action.action(Integer.parseInt(arrayList.get(i).getNum()), j))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arrayList.get(i).setBoolAction(true);

            } else {
                arrayList.get(i).setBoolAction(false);

            }
        }
    }
}
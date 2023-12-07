package org.example.epam1B.task;

import org.example.epam1B.begin.Numbers;

import java.util.ArrayList;

/*
11. Элементы, которые равны полусумме соседних элементов.
 */
public class Task11 extends Task{
    public Task11(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        System.out.println("Элементы, которые равны полусумме соседних элементов:");
        setNumber();
        showNumber(10);
    }

    public void setNumber() {
        for (int i = 1; i < arrayList.size()-1; i++) {
            if ((Integer.parseInt(arrayList.get(i-1).getNum()) +
                    Integer.parseInt(arrayList.get(i+1).getNum())) / 2 == Integer.parseInt(arrayList.get(i).getNum())) {
                arrayList.get(i).setBoolAction(true);
            } else {
                arrayList.get(i).setBoolAction(false);
            }
        }
    }
}
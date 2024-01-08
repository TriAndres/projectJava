package org.example.task;

import org.example.begin.Numbers;

import java.util.ArrayList;

/*
8. Среди чисел найти число-палиндром. Если таких чисел больше одного,
найти второе.
 */
public class Task8 extends Task {


    public Task8(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Numbers> list = new ArrayList<>();
        for (Numbers n : arrayList) {
            String num = String.valueOf(stringBuilder.append(n.getNum()).reverse());
            if (n.getNum().equals(num)) {
                list.add(n);
            }
        }
    }
}
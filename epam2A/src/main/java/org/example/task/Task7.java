package org.example.task;

import org.example.begin.Numbers;

import java.util.ArrayList;

/*
7. Найти число, состоящее только из различных цифр. Если таких чисел не-
сколько, найти первое из них.
 */
public class Task7 extends Task {


    public Task7(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        System.out.println("7. Найти число, состоящее только из различных цифр. Если таких чисел не-\n" +
                "сколько, найти первое из них.");
        System.out.println(actionNum().get(0));

    }

    public ArrayList<Numbers> actionNum() {
        ArrayList<Numbers> list = new ArrayList<>();
        for (Numbers n : arrayList) {
            String[] st = n.getNum().split("");
            boolean flag = true;
            for (int i = 0; i < st.length; i++) {
                for (int j = i + 1; j < st.length; j++) {
                    if (st[i].equals(st[j])) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                list.add(n);
            }
        }
        return list;
    }
}
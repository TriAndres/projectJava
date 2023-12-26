package org.example.task;

import org.example.begin.Numbers;

import java.util.ArrayList;

/*
4. Найти число, в котором число различных цифр минимально. Если таких
чисел несколько, найти первое из них.
 */
public class Task4 extends Task {


    public Task4(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
            int count = 0;
            int count2 = 0;
            boolean flag;
            for (Numbers numbers : arrayList) {
                System.out.println(numbers.getNum());
                String[] a = numbers.getNum().split("");
                for (int i = 0; i < a.length; i++) {
                    flag = true;
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[i].equals(a[j])) {
                            flag = false;
                        }
                    }
                    for (int j = 0; j < a.length; j++) {
                        if (a[i].equals(a[j])) {
                            count++;
                        }
                    }
                    if (flag) {
                        System.out.print(a[i] + "-" + count + "\t");
                        count2++;
                    }
                    count = 0;
                }
                System.out.println("-" + count2 + "-" + numbers.getNum().length());
                //System.out.println("-" + count2 + "-" + a.length);
                count2 = 0;
            }

    }
}
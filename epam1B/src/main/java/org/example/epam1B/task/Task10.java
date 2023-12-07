package org.example.epam1B.task;

import org.example.epam1B.begin.Numbers;

import java.util.ArrayList;

/*
10. Числа-палиндромы,значения которых в прямом и обратном порядке совпf -
дают.
 */
public class Task10 extends Task {
    public Task10(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        System.out.println("Числа-палиндромы:");
        setReverse();
        palindrome();
        showNumber(10);
    }

    public void setReverse() {
        for (int i = 0; i < arrayList.size(); i++) {
            char[] line = arrayList.get(i).getNum().toCharArray();
            StringBuilder a = new StringBuilder();
            for (int j = line.length; j > 0; j--) {
                a.append(line[j - 1]);
            }
            arrayList.get(i).setNumber(Integer.parseInt(a.toString()));
        }
    }

    public void palindrome() {
        for (Numbers numbers : arrayList) {
            if (numbers.getNum().equals(Integer.toString(numbers.getNumber()))) {
                if (numbers.getNum().length() > 1) {
                    numbers.setBoolAction(true);
                } else {
                    numbers.setBoolAction(false);
                }
            }
        }
    }
}
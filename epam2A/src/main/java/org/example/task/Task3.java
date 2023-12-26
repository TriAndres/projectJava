package org.example.task;

import org.example.begin.Numbers;
import org.example.interfaces.BoolAction1;

import java.util.ArrayList;

/*
3. Вывести на консоль те числа, длина которых меньше (больше) средней,
а также длину.
 */
public class Task3 extends Task {


    public Task3(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        setNumLength();
        boolean flag = setAVG();
        if (flag) {
            System.out.println("числа, длина которых меньше средней:");
            showAVG(i -> i == 0);
            System.out.println("\nчисла, длина которых больше средней:");
            showAVG(i -> i == 1);
        }
    }

    public boolean setAVG() {
        int sum = 0;
        for (Numbers numbers : arrayList) {
            sum += numbers.getNumLength();
        }
        if (sum > 0) {
            int avg = sum / arrayList.size();
            for (Numbers numbers : arrayList) {
                if (avg > numbers.getNumLength()) {
                    numbers.setAvg(1);
                } else if (avg < numbers.getNumLength()) {
                    numbers.setAvg(0);
                }
            }
            return true;
        } else {
            System.out.println("Список пуст, заполните его");
            return false;
        }
    }

    public void showAVG(BoolAction1 action) {
        int count = 0;
        for (Numbers numbers : arrayList) {
            if (action.action(numbers.getAvg())) {
                System.out.print("number=" + numbers.getNum() + ",length=" + numbers.getNumLength() + "\t");
                count++;
                if (count == 5) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}
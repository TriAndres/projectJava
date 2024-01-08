package org.example.task;

import org.example.begin.Numbers;

import java.util.ArrayList;

/*
5. Найти количество чисел, содержащих только четные цифры, а среди них —
количество чисел с равным числом четных и нечетных цифр.
 */
public class Task5 extends Task {


    public Task5(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task(){
        setNumLength();
        actionNum();
        System.out.println("Найти количество чисел, содержащих только четные цифры, а среди них —\n" +
                "количество чисел с равным числом четных и нечетных цифр");
        show(10);
    }

    public void actionNum() {
        for (Numbers numbers : arrayList) {
            if (Integer.parseInt(numbers.getNum()) % 2 == 0) {
                if (numbers.getNumLength() % 2 == 0) {
                    String[] line = numbers.getNum().split("");
                    int even = 0;
                    int notEven = 0;
                    for (int i = 0; i < line.length; i++) {
                        if (Integer.parseInt(line[i]) % 2 == 0) {
                            even++;
                        } else {
                            notEven++;
                        }
                    }
                    numbers.setEven(even);
                    numbers.setNotEven(notEven);
                    if (numbers.getEven() == numbers.getNotEven()) {
                        numbers.setFlag(true);
                    } else {
                        numbers.setFlag(false);
                    }
                }
            }
        }
    }

    public void show(int size) {
        int count = 0;
        for (Numbers numbers : arrayList) {
            if (numbers.isFlag()) {
                count++;
                System.out.print(numbers.getNum() + "\t");
                if (count == size) {
                    System.out.println();
                    count = 0;
                }

            }
        }
    }
}
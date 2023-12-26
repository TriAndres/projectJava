package org.example.task;

import org.example.begin.Numbers;

import java.util.ArrayList;

/*
2. Упорядочить и вывести числа в порядке возрастания (убывания) значений
их длины.
 */
public class Task2 extends Task {


    public Task2(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        setNumLength();

        System.out.println("2. Упорядочить и вывести числа в порядке возрастания (убывания) значений\n" +
                "их длины.");

        System.out.println("в порядке возрастания:");
        arrayList.sort((a, b) -> Integer.parseInt(a.getNum()) - Integer.parseInt(b.getNum()));
        showNumber();

        System.out.println("\nв порядке убывания:");
        arrayList.sort((a, b) -> Integer.parseInt(b.getNum()) - Integer.parseInt(a.getNum()));
        showNumber();

        arrayList.sort((a, b) -> Integer.parseInt(a.getId()) - Integer.parseInt(b.getId()));
    }

    void showNumber() {
        int count = 0;
        for (Numbers numbers : arrayList) {
            System.out.print("number=" + numbers.getNum() + ",length=" + numbers.getNumLength() + "\t");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
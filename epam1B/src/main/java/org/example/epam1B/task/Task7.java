package org.example.epam1B.task;

import org.example.epam1B.begin.Numbers;

import java.util.ArrayList;

/*
7. Отсортированные числа в порядке возрастания и убывания.
 */
public class Task7 extends Task {
    private int[] array;

    public Task7(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        init();
        System.out.println("Отсортированные числа в порядке возрастания");
        sortArray(">");
        show(5);
        System.out.println("Отсортированные числа в порядке убывания");
        sortArray("<");
        show(5);


    }

    public void init() {
        array = new int[arrayList.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arrayList.get(i).getNum());
        }
    }

    public void sortArray(String line) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (line.equals(">")) {
                    if (array[i] > array[j]) {
                        sortNumber(i, j);
                    }
                }
                if (line.equals("<")) {
                    if (array[i] < array[j]) {
                        sortNumber(i, j);
                    }
                }
            }
        }
    }

    private void sortNumber(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }



    public void show(int lineLength) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if ((i + 1) % lineLength == 0) System.out.println();
        }
        System.out.println();
    }
}
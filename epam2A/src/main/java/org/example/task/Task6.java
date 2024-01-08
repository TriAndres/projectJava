package org.example.task;

import org.example.begin.Numbers;

import java.util.ArrayList;

/*
6. Найти число, цифры в котором идут в строгом порядке возрастания. Если
таких чисел несколько, найти первое из них.
 */
public class Task6 extends Task {


    public Task6(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        System.out.println("6. Найти число, цифры в котором идут в строгом порядке возрастания. Если\n" +
                "таких чисел несколько, найти первое из них.");
        System.out.println(actionNum().get(0).getNum());
    }

    public ArrayList<Numbers> actionNum() {
        ArrayList<Numbers> list = new ArrayList<>();
        for (Numbers n : arrayList) {
            String[] line = n.getNum().split("");
            int min = 0;
            int count = 0;
            for (int i = 0; i < line.length - 1; i++) {
                if (min < Integer.parseInt(line[i])) {
                    min =  Integer.parseInt(line[i]);
                    count++;
                }
            }
            if (count == line.length - 1) {
                list.add(n);
            }
        }
        return list;
    }

}
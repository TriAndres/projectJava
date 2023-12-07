package org.example.epam1B.task;

import org.example.epam1B.begin.Numbers;

import java.util.ArrayList;
import java.util.Comparator;

/*
8. Числа в порядке убывания частоты встречаемости чисел.
 */
public class Task8 extends Task {
    private int[] array1;

    public Task8(ArrayList<Numbers> arrayList) {
        super(arrayList);
    }

    @Override
    public void task() {
        arrayList.sort(new Comparator<Numbers>() {
            @Override
            public int compare(Numbers o1, Numbers o2) {
                return Integer.parseInt(o2.getNum()) - Integer.parseInt(o1.getNum());
            }
        });

        init();
        countNumber();

        arrayList.sort(new Comparator<Numbers>() {
            @Override
            public int compare(Numbers o1, Numbers o2) {
                return o2.getNumber() - o1.getNumber();
            }
        });

        showSort();

        arrayList.sort(new Comparator<Numbers>() {
            @Override
            public int compare(Numbers o1, Numbers o2) {
                return Integer.parseInt(o2.getId()) - Integer.parseInt(o1.getId());
            }
        });
    }

    public void init() {
        array1 = new int[arrayList.size()];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(arrayList.get(i).getNum());
        }
    }

    public void countNumber() {
        int[] array2 = new int[this.array1.length];
        int count = 0;
        for (int i = 0; i < this.array1.length; i++) {
            for (int j = 0; j < this.array1.length; j++) {
                if (this.array1[i] == this.array1[j]) {
                    count++;
                }
            }
            array2[i] = count;
            count = 0;
        }
        for (int i = 0; i < array1.length; i++)
            arrayList.get(i).setNumber(array2[i]);
    }

    public void showSort() {
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            count++;
            if (arrayList.get(i).getNumber() == count) {
                System.out.println(arrayList.get(i).getNum() + "-" + arrayList.get(i).getNumber());
                count = 0;
            }
        }
    }

}

/*
 @Override
    public void task() {
        arrayList.sort(new Comparator<Numbers>() {
            @Override
            public int compare(Numbers o1, Numbers o2) {
                return Integer.parseInt(o1.getNum()) - Integer.parseInt(o2.getNum());
            }
        });

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
          if (map.containsKey(Integer.parseInt(arrayList.get(i).getNum()))) {
              map.put(Integer.parseInt(arrayList.get(i).getNum()), ++count );
          } else {
              map.put(Integer.parseInt(arrayList.get(i).getNum()), 1 );
          }
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            System.out.println(integerIntegerEntry.getKey() + "-" + integerIntegerEntry.getValue() );
        }

        arrayList.sort(new Comparator<Numbers>() {
            @Override
            public int compare(Numbers o1, Numbers o2) {
                return Integer.parseInt(o2.getId()) - Integer.parseInt(o1.getId());
            }
        });
    }
 */
package org.example.epam1B.manage;

import org.example.epam1B.begin.Numbers;

import java.util.ArrayList;

public class ManageNumbers {
    private ArrayList<Numbers> arrayList = new ArrayList<>();

    public ArrayList<Numbers> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Numbers> arrayList) {
        this.arrayList = arrayList;
    }

    public void add(Numbers numbers) {
        arrayList.add(numbers);
        numbers.setId(String.valueOf(arrayList.size()));
    }

    public void set(String id, String num) {
        arrayList.set(Integer.parseInt(id) - 1, new Numbers(id, num));
    }
}
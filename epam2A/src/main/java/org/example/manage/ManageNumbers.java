package org.example.manage;

import org.example.begin.Numbers;
import org.example.file.WriteReadFile;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ManageNumbers {
    private ArrayList<Numbers> arrayList = new ArrayList<>();
    private String file = "src\\main\\java\\org\\example\\file\\Numbers.txt";



    public ArrayList<Numbers> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Numbers> arrayList) {
        this.arrayList = arrayList;
    }

    public void add(Numbers numbers) {
        arrayList.add(numbers);
        arrayList.get(arrayList.size() - 1).setId(Integer.toString(arrayList.size()));
    }

    public void set(int id, Numbers numbers) {
        arrayList.set(id - 1, numbers);
        numbers.setId(Integer.toString(id));
    }

    public void clear() {
        arrayList.clear();
    }

    public void getFile(WriteReadFile wr) {
        for (String string : wr.getReaderFile(file)) {
            String[] line = string.split(" +");
            add(new Numbers(line[0], line[1]));
        }
    }

    public void setFile(WriteReadFile wr) {
        ArrayList<String> list = new ArrayList<>();
        for (Numbers numbers : arrayList) {
            list.add(numbers.getId() + " " + numbers.getNum() + "\n");
        }
        wr.setWriteFile(file, list);
    }




}
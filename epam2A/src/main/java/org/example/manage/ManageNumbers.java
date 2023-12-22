package org.example.manage;

import org.example.begin.Numbers;
import org.example.file.WriteReadFile;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ManageNumbers {
    private ArrayList<Numbers> arrayList = new ArrayList<>();
    private WriteReadFile wr = new WriteReadFile();
    private File file = new File("src\\main\\java\\org\\example\\file\\Numbers.txt");
    //private String files = "src\\main\\java\\org\\example\\file\\Numbers.txt";



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

    public void setFile() {
         file = new File("src\\main\\java\\org\\example\\file\\Numbers.txt");

        ArrayList<Numbers> list = getArrayList();
        for (Numbers numbers : list) {
            wr.setWriteFile(file, numbers.getId() + " " + numbers.getNum() + "\n");
        }
    }

    public void getFile() {
        try {
            file = new File("src\\main\\java\\org\\example\\file\\Numbers.txt");
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ArrayList<String> stringArrayList = wr.getReaderFile(file);
        for (String string : stringArrayList) {
            String[] line = string.split(" +");
            add(new Numbers(line[0], line[1]));
        }
        file.delete();
    }
}
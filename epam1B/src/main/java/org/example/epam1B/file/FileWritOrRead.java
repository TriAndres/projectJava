package org.example.epam1B.file;

import org.example.epam1B.begin.Numbers;

import java.io.*;
import java.util.ArrayList;

public class FileWritOrRead {


    public static void main(String[] args) {
        FileWritOrRead f = new FileWritOrRead();
        ArrayList<Numbers> arrayList = new ArrayList<>();
        arrayList.add(new Numbers("1111"));
        f.setFileWrite(arrayList);
        arrayList = f.getFileReader();
        for (Numbers numbers : arrayList) {
            System.out.println(numbers.getId() + " " + numbers.getNum());
        }
    }

    public void setFileWrite(ArrayList<Numbers> arrayList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\main\\java\\org\\example\\epam1B\\file\\Numbers.txt", false))) {
            for (Numbers numbers : arrayList) {
                writer.append(numbers.getId()).append(" ").append(numbers.getNum()).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Numbers> getFileReader() {
        ArrayList<Numbers> arrayList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\main\\java\\org\\example\\epam1B\\file\\Numbers.txt"))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] line2 = line.split(" +");
                arrayList.add(new Numbers(line2[0], line2[1]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return arrayList;
    }
}
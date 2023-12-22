package org.example.file;

import java.io.*;
import java.util.ArrayList;

public class WriteReadFile {

    public void setWriteFile(File file, String line) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))) {
            writer.write(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<String> getReaderFile(File file) {
        ArrayList<String> arrayList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                arrayList.add(line);
            }
        } catch (IOException e) {
            throw  new RuntimeException();
        }
        return arrayList;
    }

}

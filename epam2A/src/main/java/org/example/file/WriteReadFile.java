package org.example.file;

import java.io.*;
import java.util.ArrayList;

public class WriteReadFile {

    public void setWriteFile(String file, ArrayList<String> line) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,false))) {
            for (String string : line) {
                writer.write(string);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<String> getReaderFile(String file) {
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
